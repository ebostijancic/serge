package org.bostijancic.android.serge.androidtests;

import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;

import org.bostijancic.android.jenkdroid.R;
import org.bostijancic.android.serge.MainActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

/**
 * emil on 08/03/14.
 */
public class TestMainScreen extends EspressoTestCase<MainActivity> {

    public TestMainScreen() {
        super(MainActivity.class);
    }

    public void shouldShowCreateCiAccountWizard(String serverTypeName) {
        // click on the server type Jenkins.
        onView(withId(R.id.serverType)).perform(click());

        // select jenkins from the list of options.
        onData(allOf(is(instanceOf(String.class)), is(serverTypeName))).perform(click());

    }


    public void testShouldShowCreateJenkinsAccountWizard() {
        shouldShowCreateCiAccountWizard("Jenkins");
    }
}
