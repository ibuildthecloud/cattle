package api

import (
	"strings"

	"github.com/rancher/norman/parse"
	"github.com/rancher/norman/types"
	authzschema "github.com/rancher/types/apis/authorization.cattle.io/v1/schema"
	workloadschema "github.com/rancher/types/apis/workload.cattle.io/v1/schema"
)

func NewResolver(next parse.ResolverFunc) parse.ResolverFunc {
	return func(typeName string, apiContext *types.APIContext) error {
		return resolve(next, typeName, apiContext)
	}
}

func resolve(next parse.ResolverFunc, typeName string, apiContext *types.APIContext) error {
	// Redirect /v1-workload/projects => /v1-authz/projects
	if apiContext.Version != nil && strings.HasPrefix(typeName, "project") && apiContext.Version.Equals(&workloadschema.Version) {
		apiContext.Schema = apiContext.Schemas.Schema(&authzschema.Version, typeName)
		apiContext.Version = &authzschema.Version
	}

	if apiContext.Schema != nil {
		return nil
	}

	return next(typeName, apiContext)
}
