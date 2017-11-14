package mapper

import (
	"strings"

	"github.com/rancher/norman/types/convert"
	"github.com/rancher/norman/types/mapping/mapper"
)

type OSInfo struct {
}

func (o OSInfo) Forward(data map[string]interface{}) {
}

func (o OSInfo) Back(data map[string]interface{}) {
	cpuInfo := map[string]interface{}{
		"count": mapper.GetValueN(data, "status", "capacity", "cpu"),
	}

	kib := strings.TrimSuffix(convert.ToString(mapper.GetValueN(data, "status", "capacity", "memory")), "Ki")
	memoryInfo := map[string]interface{}{}

	kibNum, err := convert.ToNumber(kib)
	if err == nil {
		memoryInfo["memTotalKiB"] = kibNum
	}

	osInfo := map[string]interface{}{
		"dockerVersion":   strings.TrimPrefix(convert.ToString(mapper.GetValueN(data, "status", "nodeInfo", "containerRuntimeVersion")), "docker://"),
		"kernelVersion":   mapper.GetValueN(data, "status", "nodeInfo", "kernelVersion"),
		"operatingSystem": mapper.GetValueN(data, "status", "nodeInfo", "osImage"),
	}

	data["info"] = map[string]interface{}{
		"cpuInfo":    cpuInfo,
		"memoryInfo": memoryInfo,
		"osInfo":     osInfo,
	}
}
