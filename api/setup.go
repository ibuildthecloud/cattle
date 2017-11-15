package api

import (
	"github.com/rancher/norman/store/proxy"
	"github.com/rancher/norman/types"
	"github.com/rancher/types/apis/workload.cattle.io/v1/schema"
	"github.com/rancher/types/client/workload/v1"
	"k8s.io/client-go/rest"
)

func Setup(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	Namespace(k8sClient, schemas)
	Node(k8sClient, schemas)
	Pod(k8sClient, schemas)
	ReplicaSet(k8sClient, schemas)
	Deployment(k8sClient, schemas)
	StatefulSet(k8sClient, schemas)
}

func Namespace(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "namespace")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"Namespace",
		"namespaces")
}

func Node(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "node")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"Node",
		"nodes")
}

func ReplicaSet(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "replicaSet")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"apis"},
		"apps",
		"v1beta2",
		"ReplicaSet",
		"replicasets")
}

func Deployment(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "deployment")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"apis"},
		"apps",
		"v1beta2",
		"Deployment",
		"deployments")
}

func StatefulSet(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "statefulSet")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"apis"},
		"apps",
		"v1beta2",
		"StatefulSet",
		"statefulsets")
}

func Pod(k8sClient *rest.RESTClient, schemas *types.Schemas) {
	pod := schemas.Schema(&schema.Version, client.PodType)
	pod.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"Pod",
		"pods")
}
