package store

import (
	"github.com/rancher/cattle/api/namespace"
	"github.com/rancher/norman/api"
	"github.com/rancher/norman/types"
	"github.com/rancher/types/client/workload/v1"
)

func ProjectSetter(wrapper api.StoreWrapper) api.StoreWrapper {
	return func(store types.Store) types.Store {
		return wrapper(&projectIdSetterStore{
			Store: store,
		})
	}
}

type projectIdSetterStore struct {
	types.Store
}

func (p *projectIdSetterStore) ByID(apiContext *types.APIContext, schema *types.Schema, id string) (map[string]interface{}, error) {
	data, err := p.Store.ByID(apiContext, schema, id)
	if err != nil {
		return nil, err
	}

	if _, ok := schema.ResourceFields[client.NamespaceFieldProjectID]; !ok || schema.ID == client.NamespaceType {
		return data, nil
	}

	return data, nil
}

func (p *projectIdSetterStore) List(apiContext *types.APIContext, schema *types.Schema, opt types.QueryOptions) ([]map[string]interface{}, error) {
	datas, err := p.Store.List(apiContext, schema, opt)
	if err != nil {
		return nil, err
	}

	if _, ok := schema.ResourceFields[client.NamespaceFieldProjectID]; !ok || schema.ID == client.NamespaceType {
		return datas, nil
	}

	namespaceMap, err := namespace.NamespaceProjectMap(apiContext)
	if err != nil {
		return nil, err
	}

	for _, data := range datas {
		setProjectID(namespaceMap, data)
	}

	return datas, nil
}

func setProjectID(namespaceMap map[string]string, data map[string]interface{}) {
	namespace, _ := data[client.PodFieldNamespace].(string)
	projectID, _ := data[client.NamespaceFieldProjectID].(string)
	if projectID != "" {
		return
	}

	data[client.NamespaceFieldProjectID] = namespaceMap[namespace]
}
