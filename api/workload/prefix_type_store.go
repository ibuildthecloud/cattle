package workload

import (
	"strings"

	"github.com/rancher/norman/types"
)

type PrefixTypeStore struct {
	Store types.Store
}

func (p *PrefixTypeStore) ByID(apiContext *types.APIContext, schema *types.Schema, id string) (map[string]interface{}, error) {
	_, shortId := splitTypeAndId(id)
	data, err := p.Store.ByID(apiContext, schema, shortId)
	return addTypeToId(data), err
}

func (p *PrefixTypeStore) List(apiContext *types.APIContext, schema *types.Schema, opt types.QueryOptions) ([]map[string]interface{}, error) {
	data, err := p.Store.List(apiContext, schema, opt)
	return addListTypeToId(data), err
}

func (p *PrefixTypeStore) Create(apiContext *types.APIContext, schema *types.Schema, data map[string]interface{}) (map[string]interface{}, error) {
	data, err := p.Store.Create(apiContext, schema, data)
	return addTypeToId(data), err
}

func (p *PrefixTypeStore) Update(apiContext *types.APIContext, schema *types.Schema, data map[string]interface{}, id string) (map[string]interface{}, error) {
	_, shortId := splitTypeAndId(id)
	data, err := p.Store.Update(apiContext, schema, data, shortId)
	return addTypeToId(data), err
}

func (p *PrefixTypeStore) Delete(apiContext *types.APIContext, schema *types.Schema, id string) error {
	_, shortId := splitTypeAndId(id)
	return p.Store.Delete(apiContext, schema, shortId)
}

func splitTypeAndId(id string) (string, string) {
	parts := strings.SplitN(id, ":", 2)
	if len(parts) < 2 {
		// Must conform
		return "", ""
	}
	return parts[0], parts[1]
}

func addTypeToId(data map[string]interface{}) map[string]interface{} {
	typeName, _ := data["type"].(string)
	id, _ := data["id"].(string)
	if typeName != "" && id != "" {
		data["id"] = strings.ToLower(typeName) + ":" + id
	}
	return data
}

func addListTypeToId(data []map[string]interface{}) []map[string]interface{} {
	var result []map[string]interface{}
	for _, item := range data {
		result = append(result, addTypeToId(item))
	}
	return result
}
