package main

import (
	"context"
	"fmt"
	"net/http"
	"os"

	"github.com/rancher/norman/server"
	"github.com/rancher/norman/store/proxy"
	"github.com/rancher/norman/types"
	authzSchema "github.com/rancher/types/apis/authorization.cattle.io/v1/schema"
	clusterSchema "github.com/rancher/types/apis/cluster.cattle.io/v1/schema"
	workloadSchema "github.com/rancher/types/apis/workload.cattle.io/v1/schema"
	"github.com/rancher/types/client/workload/v1"
	"k8s.io/client-go/tools/clientcmd"
)

func main() {

	config, err := clientcmd.BuildConfigFromFlags("", os.Getenv("KUBECONFIG"))
	if err != nil {
		panic(err)
	}

	k8sClient, apiExtClient, err := server.NewClientsFromConfig(config)
	if err != nil {
		panic(err)
	}

	schemas := types.NewSchemas().
		AddSchemas(workloadSchema.Schemas).
		AddSchemas(clusterSchema.Schemas).
		AddSchemas(authzSchema.Schemas)

	pod := schemas.Schema(&workloadSchema.Version, client.PodType)
	pod.Store = proxy.NewProxyStore(k8sClient,
		[]string{"api"},
		"",
		"v1",
		"Pod",
		"pods")

	server, err := server.NewAPIServerFromClients(context.Background(), k8sClient, apiExtClient, schemas)
	if err != nil {
		panic(err)
	}

	//sgClient, err := v3.NewScalingGroupClient("", *config)
	//if err != nil {
	//	panic(err)
	//}
	//
	//controller, err := sgClient.Controller()
	//if err != nil {
	//	panic(err)
	//}
	//
	//controller.AddHandler(func(key string, sg *v3.ScalingGroup) error {
	//	fmt.Println("changed:", key, sg)
	//	return nil
	//})
	//
	//if err := controller.Start(1, context.Background()); err != nil {
	//	panic(err)
	//}

	fmt.Println("Listening on 0.0.0.0:1234")
	if err := http.ListenAndServe("0.0.0.0:1234", server); err != nil {
		panic(err)
	}

}
