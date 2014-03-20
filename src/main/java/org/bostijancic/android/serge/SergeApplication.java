package org.bostijancic.android.serge;

import com.activeandroid.ActiveAndroid;

/**
 * Created by ebostijancic on 20.03.14.
 */
public class SergeApplication extends com.activeandroid.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ActiveAndroid.dispose();
    }
}
