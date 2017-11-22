package api

import (
	"context"

	"github.com/rancher/cattle/api/pod"
	"github.com/rancher/cattle/api/workload"
	"github.com/rancher/norman/api/formatter"
	"github.com/rancher/norman/store/crd"
	"github.com/rancher/norman/store/proxy"
	"github.com/rancher/norman/store/tranform"
	"github.com/rancher/norman/types"
	authzschema "github.com/rancher/types/apis/authorization.cattle.io/v1/schema"
	"github.com/rancher/types/apis/workload.cattle.io/v1/schema"
	"github.com/rancher/types/client/workload/v1"
	"k8s.io/apiextensions-apiserver/pkg/client/clientset/clientset"
	"k8s.io/client-go/rest"
)

func Setup(ctx context.Context, apiExtClient clientset.Interface, k8sClient rest.Interface, schemas *types.Schemas) error {
	Namespace(k8sClient, schemas)
	Node(k8sClient, schemas)
	Pod(k8sClient, schemas)
	DaemonSet(k8sClient, schemas)
	ReplicaSet(k8sClient, schemas)
	ReplicationController(k8sClient, schemas)
	Deployment(k8sClient, schemas)
	StatefulSet(k8sClient, schemas)
	Project(k8sClient, schemas)

	crdStore := crd.NewCRDStore(apiExtClient, k8sClient)
	if err := crdStore.AddSchemas(ctx, schemas); err != nil {
		return err
	}

	Workload(k8sClient, schemas)

	return nil
}

func Project(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&authzschema.Version, "project")
	schema.Formatter = formatter.SubContextFormatter
}

func Namespace(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "namespace")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"Namespace",
		"namespaces")
}

func Node(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "node")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"Node",
		"nodes")
}

func DaemonSet(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "daemonSet")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"apis"},
		"apps",
		"v1beta2",
		"DaemonSet",
		"daemonsets")
}

func ReplicaSet(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "replicaSet")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"apis"},
		"apps",
		"v1beta2",
		"ReplicaSet",
		"replicasets")
}

func ReplicationController(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "replicationController")
	schema.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"ReplicationController",
		"replicationcontrollers")
}

func Deployment(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "deployment")
	schema.Store = &workload.PrefixTypeStore{
		Store: proxy.NewProxyStore(k8sClient,
			[]string{"apis"},
			"apps",
			"v1beta2",
			"Deployment",
			"deployments"),
	}
}

func Workload(k8sClient rest.Interface, schemas *types.Schemas) {
	workloadSchema := schemas.Schema(&schema.Version, "workload")
	deploymentSchema := schemas.Schema(&schema.Version, "deployment")
	statefulSet := schemas.Schema(&schema.Version, "statefulSet")
	replicaSet := schemas.Schema(&schema.Version, "replicaSet")
	replicationController := schemas.Schema(&schema.Version, "replicationController")
	daemonSet := schemas.Schema(&schema.Version, "daemonSet")

	workloadSchema.Store = &workload.PrefixTypeStore{
		Store: workloadSchema.Store,
	}

	workloadSchema.Store = workload.NewAggregateStore(workloadSchema.Store,
		workloadSchema,
		deploymentSchema,
		replicaSet,
		replicationController,
		daemonSet,
		deploymentSchema,
		statefulSet)
}

func StatefulSet(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, "statefulSet")
	schema.Store = &workload.PrefixTypeStore{
		Store: proxy.NewProxyStore(k8sClient,
			[]string{"apis"},
			"apps",
			"v1beta2",
			"StatefulSet",
			"statefulsets"),
	}
}

func Pod(k8sClient rest.Interface, schemas *types.Schemas) {
	schema := schemas.Schema(&schema.Version, client.PodType)
	schema.Store = &tranform.TransformingStore{
		Store: proxy.NewProxyStore(k8sClient,
			[]string{"api"},
			"",
			"v1",
			"Pod",
			"pods"),
		Transformer:     pod.Transform,
		ListTransformer: pod.ListTransform,
	}
}
