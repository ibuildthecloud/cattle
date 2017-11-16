package workload

import (
	"github.com/rancher/norman/types"
	"golang.org/x/sync/errgroup"
)

type Store struct {
	WorkloadStore types.Store
	Schemas       []*types.Schema
}

func (w *Store) ByID(apiContext *types.APIContext, schema *types.Schema, id string) (map[string]interface{}, error) {
	return w.WorkloadStore.ByID(apiContext, schema, id)
}

func (w *Store) List(apiContext *types.APIContext, schema *types.Schema, opt *types.QueryOptions) ([]map[string]interface{}, error) {
	items := make(chan map[string]interface{})

	g, ctx := errgroup.WithContext(apiContext.Request.Context())

	submit := func(schema *types.Schema, store types.Store) {
		g.Go(func() error {
			data, err := store.List(apiContext, schema, opt)
			if err != nil {
				return err
			}
			for _, item := range data {
				select {
				case items <- item:
				case <-ctx.Done():
					return ctx.Err()
				}
			}
			return nil
		})
	}

	for _, s := range append(w.Schemas, schema) {
		if s == schema {
			submit(s, w.WorkloadStore)
		} else {
			submit(s, s.Store)
		}
	}

	go func() {
		g.Wait()
		close(items)
	}()

	result := []map[string]interface{}{}
	for item := range items {
		result = append(result, item)
	}

	return result, g.Wait()
}

func (w *Store) Create(apiContext *types.APIContext, schema *types.Schema, data map[string]interface{}) (map[string]interface{}, error) {
	return w.WorkloadStore.Create(apiContext, schema, data)
}

func (w *Store) Update(apiContext *types.APIContext, schema *types.Schema, data map[string]interface{}, id string) (map[string]interface{}, error) {
	return w.WorkloadStore.Update(apiContext, schema, data, id)
}

func (w *Store) Delete(apiContext *types.APIContext, schema *types.Schema, id string) error {
	return w.WorkloadStore.Delete(apiContext, schema, id)
}
