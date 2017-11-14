package cluster

import (
	"github.com/rancher/go-rancher/vnext"
	"github.com/rancher/norman/store/empty"
)

type Store struct {
	empty.Store
}

func (s *Store) ByID(apiContext *client.APIContext, schema *client.Schema, id string) (map[string]interface{}, error) {
	data := getCluster()
	if data["id"] == id {
		return data, nil
	}
	return nil, nil
}

func (s *Store) List(apiContext *client.APIContext, schema *client.Schema, opt *client.QueryOptions) ([]map[string]interface{}, error) {
	return []map[string]interface{}{
		getCluster(),
	}, nil
}

func getCluster() map[string]interface{} {
	return map[string]interface{}{
		"id":    "local",
		"type":  "cluster",
		"name":  "Local Cluster",
		"state": "active",
	}
}
