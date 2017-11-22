package pod

import (
	"github.com/rancher/cattle/api/workload"
	"github.com/rancher/norman/types"
)

func Transform(context *types.APIContext, data map[string]interface{}) (map[string]interface{}, error) {
	mapping, err := workload.WorkloadOwnerMap(context)
	if err != nil {
		return nil, err
	}

	return assignID(data, mapping), nil
}

func assignID(data map[string]interface{}, mapping map[string]string) map[string]interface{} {
	owner := workload.ResolveWorkloadID(data, mapping)
	if owner != "" {
		data["workloadId"] = owner
	}

	return data
}

func ListTransform(context *types.APIContext, data []map[string]interface{}) ([]map[string]interface{}, error) {
	mapping, err := workload.WorkloadOwnerMap(context)
	if err != nil {
		return nil, err
	}

	var result []map[string]interface{}
	for _, item := range data {
		result = append(result, assignID(item, mapping))
	}

	return result, nil
}
