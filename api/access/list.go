package access

import (
	"fmt"

	"github.com/rancher/norman/parse/builder"
	"github.com/rancher/norman/types"
	"github.com/rancher/norman/types/convert"
)

func List(context *types.APIContext, version *types.APIVersion, typeName string, into interface{}) error {
	schema := context.Schemas.Schema(version, typeName)
	if schema == nil {
		return fmt.Errorf("failed to find schema " + typeName)
	}

	data, err := schema.Store.List(context, schema, types.QueryOptions{})
	if err != nil {
		return err
	}

	b := builder.NewBuilder(context)

	var newData []map[string]interface{}
	for _, item := range data {
		item, err = b.Construct(schema, item, builder.List)
		if err != nil {
			return err
		}
		newData = append(newData, item)
	}

	return convert.ToObj(newData, into)
}
