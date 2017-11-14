package project

import "github.com/rancher/go-rancher/vnext"

func Customize(schema *client.Schema) {
	schema.Formatter = Formatter
}

func Formatter(apiContext *client.APIContext, resource *client.RawResource) {
	resource.Values["state"] = "active"
}
