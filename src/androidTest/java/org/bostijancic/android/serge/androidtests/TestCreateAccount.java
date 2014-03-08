package org.bostijancic.android.serge.androidtests;

import android.test.ActivityInstrumentationTestCase2;

import org.bostijancic.android.jenkdroid.R;
import org.bostijancic.android.serge.MainActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

/* some static imports to get human readable espresso test method invocations. */

/**
 * simple test to test the MainActivity.
 * <p/>
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

    public void shouldShowCreateCiAccountWizard(String serverTypeName) {
        // click on the server type Jenkins.
        onView(withId(R.id.serverType)).perform(click());

        // select jenkins from the list of options.
        onData(allOf(is(instanceOf(String.class)), is(serverTypeName))).perform(click());

        onView(withId(R.id.serverUrl)).perform(typeText("http://saturn:8080/jenkins"));

        onView(withId(R.id.username)).perform(typeText("emil"));

        onView(withId(R.id.password)).perform(typeText("eide5Xee"));

        onView(withId(R.id.tryLogin)).perform(click());

    }

    public void testShouldShowCreateJenkinsAccountWizard() {
        shouldShowCreateCiAccountWizard("Jenkins");
    }

    public void testShouldShowCreateHudsonAccountWizard() {
        shouldShowCreateCiAccountWizard("Hudson");
    }

    public void testShouldShowCreateBambooAccountWizard() {
        shouldShowCreateCiAccountWizard("Bamboo");
    }

}
