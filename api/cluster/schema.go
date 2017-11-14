package cluster

import (
	"github.com/rancher/go-rancher/vnext"
)

func Customize(schema *client.Schema) *client.Schema {
	schema.Store = &Store{}
	return schema
}
