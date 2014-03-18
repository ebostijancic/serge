package org.bostijancic.android.serge.jenkins.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * emil on 09/03/14.
 */
@DatabaseTable(tableName = "jenkinsJob")
public class JenkinsJob {
    @DatabaseField(id = true)
    private Integer buildNumber;

    @DatabaseField
    private String name;

    @DatabaseField
    private String url;

    @DatabaseField
    private String color;

    @DatabaseField
    private JenkinsServer jenkinsServer;

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
