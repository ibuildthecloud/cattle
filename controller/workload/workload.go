package workload

import (
	"github.com/rancher/types/apis/workload.cattle.io/v1"
	"k8s.io/apimachinery/pkg/api/meta"
	"k8s.io/apimachinery/pkg/runtime"
)

var (
	workloadController = "workload-controller"
	initialized        = "io.cattle.lifecycle.initialized"
)

type WorkloadController struct {
	lifecycle ObjectLifecycle
}

func something(workloadClient v1.Interface) {
	controller := workloadClient.Workloads("").Controller()
	controller.AddHandler(syncWorkload)
}

func (w *WorkloadController) sync(key string, obj *v1.Workload) error {
	if ok, err := w.shouldInitialize(obj); err != nil {
		return err
	} else if ok {

	}
}

func (w *WorkloadController) shouldInitialize(obj runtime.Object) (bool, error) {
	metadata, err := meta.Accessor(obj)
	if err != nil {
		return false, err
	}

	return "true" == metadata.GetLabels()[initialized], nil
}
