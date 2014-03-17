package org.bostijancic.android.serge.androidtests.unit;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by ebostijancic on 14.03.14.
 */
public class SimpleAndroidUnitTest extends AndroidTestCase {


    @Override
    protected void setUp() throws Exception {
        Log.d(SimpleAndroidUnitTest.class.getName(), "Setup Test");
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        Log.d(SimpleAndroidUnitTest.class.getName(), "Tear Down Test");
        super.tearDown();
    }

    public void testSimple() {
        testAndroidTestCaseSetupProperly();
    }
}
