package io.cattle.platform.token;

import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;

public class CACertSet {
    byte[] certPem, keyPem;
    X509Certificate cert;
    PrivateKey key;

    public CACertSet(X509Certificate cert, PrivateKey key, byte[] certPem, byte[] keyPem) {
        super();
        this.cert = cert;
        this.key = key;
        this.certPem = certPem;
        this.keyPem = keyPem;
    }

    @Override
    public String createTar() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        TarArchiveOutputStream tar = new TarArchiveOutputStream(baos);

        TarArchiveEntry entry = new TarArchiveEntry("ca.pem");
        entry.setSize(certPem.length);
        tar.putArchiveEntry(entry);
        tar.write(certPem);
        tar.closeArchiveEntry();

        entry = new TarArchiveEntry("ca-key.pem");
        entry.setSize(keyPem.length);
        tar.putArchiveEntry(entry);
        tar.write(keyPem);
        tar.closeArchiveEntry();
        tar.close();

        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }

    public X509Certificate getCert() {
        return cert;
    }

    public PrivateKey getKey() {
        return key;
    }

}