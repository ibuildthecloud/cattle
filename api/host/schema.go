package host

import (
	"github.com/rancher/go-rancher/client"
	mk "github.com/rancher/norman/kattle/api/mapper"
	"github.com/rancher/norman/types/mapping"
	m "github.com/rancher/norman/types/mapping/mapper"
	"k8s.io/client-go/rest"
)

var (
	HostMapper m.Mapper = m.CombinedMapper{
		Mappers: []m.Mapper{
			m.SetType{"host"},
			mapping.Metadata,
			m.Enum{
				From: "externalId",
				To:   "spec/externalID",
			},
			mk.HostState{},
			mk.HostAddresses{},
			mk.OSInfo{},
		},
	}
)

func Customize(k8sClient *rest.RESTClient, schema *client.Schema) {
	schema.Store = NewStore(k8sClient)
}
