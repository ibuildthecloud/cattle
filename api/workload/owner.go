package workload

import (
	"fmt"

	"strings"

	"github.com/rancher/cattle/api/access"
	"github.com/rancher/norman/types"
	"github.com/rancher/norman/types/mapper"
	"github.com/rancher/types/apis/workload.cattle.io/v1/schema"
	"github.com/rancher/types/client/workload/v1"
)

func WorkloadOwnerMap(context *types.APIContext) (map[string]string, error) {
	result := map[string]string{}

	var workloads []client.Workload
	if err := access.List(context, &schema.Version, client.WorkloadType, &workloads); err != nil {
		return nil, err
	}

	for _, workload := range workloads {
		for _, owner := range workload.OwnerReferences {
			if owner.Controller != nil && *owner.Controller {
				id := key(workload.Type, workload.Name)
				result[id] = key(owner.Kind, owner.Name)
			}
		}
	}

	return result, nil
}

func ResolveWorkloadID(data map[string]interface{}, owners map[string]string) string {
	workloadID := ""

	ownerReferences, ok := mapper.GetSlice(data, "ownerReferences")
	if !ok {
		return ""
	}

	for _, ownerReference := range ownerReferences {
		controller, _ := ownerReference["controller"].(bool)
		if !controller {
			continue
		}

		kind, _ := ownerReference["kind"].(string)
		name, _ := ownerReference["name"].(string)
		parent := key(kind, name)
		workloadID = ""
		for parent != "" {
			workloadID = parent
			parent = owners[workloadID]
		}
	}

	if workloadID == "" {
		return ""
	}

	parts := strings.SplitN(workloadID, "/", 2)
	namespace, _ := data["namespace"].(string)
	return fmt.Sprintf("%s:%s:%s", parts[0], namespace, parts[1])
}

func key(kind, name string) string {
	return strings.ToLower(fmt.Sprintf("%s/%s", kind, name))
}
