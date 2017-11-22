package main

import (
	"context"
	"fmt"
	"net/http"
	"os"

	"github.com/rancher/cattle/api"
	"github.com/rancher/cattle/store"
	normanapi "github.com/rancher/norman/api"
	"github.com/rancher/norman/server"
	"github.com/rancher/norman/types"
	authzSchema "github.com/rancher/types/apis/authorization.cattle.io/v1/schema"
	clusterSchema "github.com/rancher/types/apis/cluster.cattle.io/v1/schema"
	workloadSchema "github.com/rancher/types/apis/workload.cattle.io/v1/schema"
	"k8s.io/client-go/tools/clientcmd"
)

func main() {
	ctx := context.Background()

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

	api.Setup(ctx, apiExtClient, k8sClient, schemas)

	server := normanapi.NewAPIServer()
	server.Resolver = api.NewResolver(server.Resolver)
	server.StoreWrapper = store.ProjectSetter(server.StoreWrapper)

	if err := server.AddSchemas(schemas); err != nil {
		panic(err)
	}

	fmt.Println("Listening on 0.0.0.0:1234")
	if err := http.ListenAndServe("0.0.0.0:1234", server); err != nil {
		panic(err)
	}

}
