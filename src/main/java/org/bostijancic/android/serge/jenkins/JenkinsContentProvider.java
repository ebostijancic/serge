package org.bostijancic.android.serge.jenkins;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * Created by ebostijancic on 16.03.14.
 */
public class JenkinsContentProvider extends ContentProvider {
    public static final String TYPE = "org.bostijancic.android.serge.provider.jenkins";
    public static final String JOB_URI = TYPE + "/jobs";

    public static final String COLUMN_JOB_NAME = "jobName";
    public static final String COLUMN_JOB_COLOR = "jobColor";
    public static final String COLUMN_JOB_BUILD = "jobBuildNumber";

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings2, String s2) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return TYPE;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {

        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
