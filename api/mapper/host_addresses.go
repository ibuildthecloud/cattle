package mapper

import "github.com/rancher/norman/types/mapping/mapper"

type HostAddresses struct {
}

func (h HostAddresses) Forward(data map[string]interface{}) {
}

func (h HostAddresses) Back(data map[string]interface{}) {
	addresses, _ := mapper.GetSlice(data, "status", "addresses")
	for _, address := range addresses {
		t := address["type"]
		a := address["address"]
		if t == "InternalIP" {
			data["agentIpAddress"] = a
		} else if t == "Hostname" {
			data["hostname"] = a
		}
	}
}
