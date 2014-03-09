package org.bostijancic.android.serge.jenkins;

import org.bostijancic.android.serge.jenkins.authenticator.JenkinsService;
import org.bostijancic.android.serge.jenkins.model.Jenkins;

import retrofit.RestAdapter;

/**
 * emil on 09/03/14.
 */
public class JenkinsHttpClient {

    public Jenkins getJenkinsData() {
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://saturn:8080/jenkins").build();

        JenkinsService jenkinsService = restAdapter.create(JenkinsService.class);

        return jenkinsService.getJenkins();
    }
}
