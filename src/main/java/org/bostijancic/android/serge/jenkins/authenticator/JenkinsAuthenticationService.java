package org.bostijancic.android.serge.jenkins.authenticator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by ebostijancic on 11.03.14.
 */
public class JenkinsAuthenticationService extends Service {
    private JenkinsAuthenticator authenticator;

    @Override
    public IBinder onBind(Intent intent) {
        if (authenticator == null) {
            authenticator = new JenkinsAuthenticator(this);
        }
        return authenticator.getIBinder();
    }
}
