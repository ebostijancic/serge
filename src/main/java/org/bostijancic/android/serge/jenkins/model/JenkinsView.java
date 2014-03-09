package org.bostijancic.android.serge.jenkins.model;

import java.net.URL;

/**
 * emil on 09/03/14.
 */
public class JenkinsView {
    private String name;
    private URL url;

    public JenkinsView() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
