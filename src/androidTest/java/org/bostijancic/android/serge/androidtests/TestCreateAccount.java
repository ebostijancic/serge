package org.bostijancic.android.serge.androidtests;

import android.test.ActivityInstrumentationTestCase2;

import org.bostijancic.android.jenkdroid.R;
import org.bostijancic.android.serge.MainActivity;

/* some static imports to get human readable espresso test method invocations. */
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;

/**
 * simple test to test the MainActivity.
 *
 * ebostijancic on 07.03.14.
 */
public class TestCreateAccount extends ActivityInstrumentationTestCase2<MainActivity> {

    // this public no-arg constructor is necessary for calling espresso tests.
    public TestCreateAccount() {
        super(MainActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // it's important to call getActivity(); otherwise an exception is thrown.
        getActivity();
    }

    /**
     * simple test just to see if espresso is working correctly.
     */
    public void testOpenAccountView() {
        onView(withId(R.id.serverName)).perform(typeText("emil"));
    }

}
