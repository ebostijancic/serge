package org.bostijancic.android.serge.androidtests;

import android.test.ActivityInstrumentationTestCase2;

/* some static imports to get human readable espresso test method invocations. */

import static com.google.android.apps.common.testing.ui.espresso.Espresso.*;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.*;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.*;

/**
 * emil on 08/03/14.
 */
public class EspressoTestCase<T> extends ActivityInstrumentationTestCase2 {

    public EspressoTestCase(Class<T> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.getActivity();
    }
}
