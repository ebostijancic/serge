package org.bostijancic.android.serge.jenkins.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.net.URL;

/**
 * emil on 09/03/14.
 */
@DatabaseTable(tableName = "jenkinsViews")
public class JenkinsView {

    @DatabaseField
    private String name;

    @DatabaseField
    private URL url;

    @DatabaseField
    private JenkinsServer jenkinsServer;

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
