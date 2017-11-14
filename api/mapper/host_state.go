package mapper

type HostState struct {
}

func (h HostState) Forward(data map[string]interface{}) {
}

func (h HostState) Back(data map[string]interface{}) {
	data["state"] = "active"
}
