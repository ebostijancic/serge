package org.bostijancic.android.serge.androidtests.ui;

import android.test.ActivityInstrumentationTestCase2;

/**
 * ebostijancic on 08/03/14.
 */
public abstract class EspressoTestCase<T> extends ActivityInstrumentationTestCase2 {

    public EspressoTestCase(Class<T> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.getActivity();
    }
}
