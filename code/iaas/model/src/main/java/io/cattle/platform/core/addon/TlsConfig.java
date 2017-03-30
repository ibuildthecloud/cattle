package io.cattle.platform.core.addon;

import io.github.ibuildthecloud.gdapi.annotation.Type;

@Type(list = false)
public class TlsConfig {

    boolean caBundle;

    public boolean isCaBundle() {
        return caBundle;
    }

    public void setCaBundle(boolean caBundle) {
        this.caBundle = caBundle;
    }

}
