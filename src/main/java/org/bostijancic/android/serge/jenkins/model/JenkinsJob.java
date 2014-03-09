package org.bostijancic.android.serge.jenkins.model;

/**
 * emil on 09/03/14.
 */
public class JenkinsJob {
    private String name;
    private String url;
    private String color;

    public JenkinsJob() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
