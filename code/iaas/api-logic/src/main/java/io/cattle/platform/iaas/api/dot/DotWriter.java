package io.cattle.platform.iaas.api.dot;

import io.github.ibuildthecloud.gdapi.request.ApiRequest;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.annotation.PostConstruct;

import org.apache.commons.io.IOUtils;

public class DotWriter {

    String html;

    public boolean writeResponse(String dot, ApiRequest request) throws IOException {
        if ( dot != null ) {
            String content = getContent(request, dot);
            try {
                request.getOutputStream().write(content.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }
            return true;
        }

        return false;
    }

    protected String getContent(ApiRequest request, String dot) {
        if ( "html".equals(request.getResponseFormat()) ) {
            request.setResponseContentType("text/html; charset=utf-8");
            return asHtml(dot);
        } else {
            request.setResponseContentType("text/plain");
            return dot;
        }
    }

    protected String asHtml(String dot) {
        return html.replace("%DOT%", dot);
    }

    @PostConstruct
    public void init() throws IOException {
        InputStream is = null;
        try {
            is = getClass().getResourceAsStream("html-override.txt");
            if ( is == null ) {
                is = getClass().getResourceAsStream("html.txt");
            }

            if ( is != null ) {
                this.html = IOUtils.toString(is);
            }
        } finally {
            IOUtils.closeQuietly(is);
        }
    }

}