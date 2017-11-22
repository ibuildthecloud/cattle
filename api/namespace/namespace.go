package namespace

import (
	"github.com/rancher/cattle/api/access"
	"github.com/rancher/norman/types"
	"github.com/rancher/types/apis/workload.cattle.io/v1/schema"
	"github.com/rancher/types/client/workload/v1"
)

func NamespaceProjectMap(apiContext *types.APIContext) (map[string]string, error) {
	var namespaces []client.Namespace
	if err := access.List(apiContext, &schema.Version, client.NamespaceType, &namespaces); err != nil {
		return nil, err
	}

	result := map[string]string{}
	for _, namespace := range namespaces {
		result[namespace.Name] = namespace.ProjectID
	}

	return result, nil
}
