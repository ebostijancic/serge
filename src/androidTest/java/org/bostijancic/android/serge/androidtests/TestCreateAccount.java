package org.bostijancic.android.serge.androidtests;

import android.test.ActivityInstrumentationTestCase2;

import com.google.android.apps.common.testing.ui.espresso.Espresso;
import com.google.android.apps.common.testing.ui.espresso.action.ViewActions;
import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;

import org.bostijancic.android.jenkdroid.R;
import org.bostijancic.android.serge.MainActivity;

/**
 * Created by ebostijancic on 07.03.14.
 */
public class TestCreateAccount extends ActivityInstrumentationTestCase2<MainActivity> {

    public TestCreateAccount(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public void testOpenAccountView() {
       Espresso.onView(ViewMatchers.withId(R.id.serverName)).perform(ViewActions.typeText("emil"));


    }

}
