package mapper

import (
	"strings"

	"github.com/rancher/norman/types"
	m "github.com/rancher/norman/types/mapping/mapper"
)

type PivotMapper struct {
	Plural bool
}

func (r PivotMapper) FromInternal(data map[string]interface{}) {
	for key, value := range data {
		mapValue, ok := value.(map[string]interface{})
		if !ok {
			continue
		}
		for subKey, subValue := range mapValue {
			if r.Plural {
				m.PutValue(data, subValue, subKey, strings.TrimSuffix(key, "s"))
			} else {
				m.PutValue(data, subValue, subKey, key)

			}

		}
		delete(data, key)
	}
}

func (r PivotMapper) ToInternal(data map[string]interface{}) {
	for key, value := range data {
		mapValue, ok := value.(map[string]interface{})
		if !ok {
			continue
		}
		for subKey, subValue := range mapValue {
			if r.Plural {
				m.PutValue(data, subValue, subKey, key+"s")
			} else {
				m.PutValue(data, subValue, subKey, key)
			}
		}
		delete(data, key)
	}
}

func (r PivotMapper) ModifySchema(schema *types.Schema, schemas *types.Schemas) error {
	return nil
}
