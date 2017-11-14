package host

import (
	"github.com/rancher/go-rancher/vnext"
	"github.com/rancher/norman/store/proxy"
	"k8s.io/client-go/rest"
)

type Store struct {
	nodeStore *proxy.Store
	podStore  *proxy.Store
}

func NewStore(k8sClient *rest.RESTClient) client.Store {
	s := &Store{
		nodeStore: proxy.NewProxyStore(k8sClient,
			[]string{"api"},
			"",
			"v1",
			"Node",
			"nodes"),
		podStore: proxy.NewProxyStore(k8sClient,
			[]string{"api"},
			"",
			"v1",
			"Node",
			"nodes"),
	}

	s.nodeStore.Mapper = HostMapper

	return s
}

func (s *Store) List(apiContext *client.APIContext, schema *client.Schema, opt *client.QueryOptions) ([]map[string]interface{}, error) {
	clusterId, err := s.getClusterId(apiContext, schema)
	if err != nil {
		return nil, err
	}

	nodes, err := s.nodeStore.List(apiContext, schema, nil)
	if err != nil {
		return nil, err
	}

	result := []map[string]interface{}{}
	for _, node := range nodes {
		node["clusterId"] = clusterId
		result = append(result, node)
	}

	return result, nil
}

func (s *Store) Delete(apiContext *client.APIContext, schema *client.Schema, id string) error {
	return s.nodeStore.Delete(apiContext, schema, id)
}

func (s *Store) ByID(apiContext *client.APIContext, schema *client.Schema, id string) (map[string]interface{}, error) {
	return s.singleOp(apiContext, schema, func() (map[string]interface{}, error) {
		return s.nodeStore.ByID(apiContext, schema, id)
	})
}

func (s *Store) singleOp(apiContext *client.APIContext, schema *client.Schema, op func() (map[string]interface{}, error)) (map[string]interface{}, error) {
	clusterId, err := s.getClusterId(apiContext, schema)
	if err != nil {
		return nil, err
	}

	node, err := op()
	if err != nil {
		return nil, err
	}

	s.formatResponse(clusterId, node)
	return node, nil
}

func (s *Store) formatResponse(clusterId string, node map[string]interface{}) {
	node["clusterId"] = clusterId
}

func (s *Store) Create(apiContext *client.APIContext, schema *client.Schema, data map[string]interface{}) (map[string]interface{}, error) {
	return s.singleOp(apiContext, schema, func() (map[string]interface{}, error) {
		return s.nodeStore.Create(apiContext, schema, data)
	})
}

func (s *Store) Update(apiContext *client.APIContext, schema *client.Schema, data map[string]interface{}, id string) (map[string]interface{}, error) {
	return s.singleOp(apiContext, schema, func() (map[string]interface{}, error) {
		return s.nodeStore.Update(apiContext, schema, data, id)
	})
}

func (s *Store) getClusterId(apiContext *client.APIContext, schema *client.Schema) (string, error) {
	clusterSchema := apiContext.Schemas.Schema(apiContext.Version, "cluster")
	if clusterSchema == nil {
		return "", nil
	}
	datas, err := clusterSchema.Store.List(apiContext, clusterSchema, nil)
	if err != nil {
		return "", err
	}
	name, _ := datas[0]["id"].(string)
	return name, nil
}
