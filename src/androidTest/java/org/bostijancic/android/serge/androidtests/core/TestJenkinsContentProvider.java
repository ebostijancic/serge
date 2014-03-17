package org.bostijancic.android.serge.androidtests.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.test.ProviderTestCase2;

import org.bostijancic.android.serge.jenkins.JenkinsContentProvider;

/**
 * Created by ebostijancic on 16.03.14.
 */
public class TestJenkinsContentProvider extends ProviderTestCase2<JenkinsContentProvider> {

    public TestJenkinsContentProvider(Class<JenkinsContentProvider> providerClass, String providerAuthority) {
        super(providerClass, providerAuthority);
    }

    public TestJenkinsContentProvider() {
        super(JenkinsContentProvider.class, JenkinsContentProvider.TYPE);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testInsert() {
        String jobUri = JenkinsContentProvider.JOB_URI;
        Uri uri = Uri.parse(jobUri);
        ContentValues contentValues = new ContentValues();
        contentValues.put(JenkinsContentProvider.COLUMN_JOB_NAME, "Job1");
        contentValues.put(JenkinsContentProvider.COLUMN_JOB_COLOR, "green");
        contentValues.put(JenkinsContentProvider.COLUMN_JOB_BUILD, 400);

        Uri inserted = getProvider().insert(uri, contentValues);

        assertNotNull(inserted);

        String jobWithBuild400 = JenkinsContentProvider.JOB_URI + "/" + contentValues.get(JenkinsContentProvider.COLUMN_JOB_BUILD);

        Cursor cursor = getProvider().query(Uri.parse(jobWithBuild400), null, null, null, null);
        assertNotNull(cursor);
    }

    public void testQuery() {

    }

    public void testDelete() {

    }

    public void testUpdate() {

    }
}


