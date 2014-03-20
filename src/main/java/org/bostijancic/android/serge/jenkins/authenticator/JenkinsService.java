package org.bostijancic.android.serge.jenkins.authenticator;

import org.bostijancic.android.serge.jenkins.model.JenkinsServer;

import retrofit.http.GET;

/**
 * emil on 09/03/14.
 */
public interface JenkinsService {

    @GET("/api/json")
    public JenkinsServer
    getJenkins();
}

