package org.bostijancic.android.serge.jenkins.services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;

import org.bostijancic.android.serge.jenkins.model.JenkinsServer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ebostijancic on 18.03.14.
 */
public class SergeDatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASE_NAME = "serge.db";
    public static final int DATABASE_VERSION = 1;

    private Dao<JenkinsServer, Integer> jenkinsServerDao = null;

    protected void log(String message) {
        Log.d(this.getClass().getName(), message);
    }

    public SergeDatabaseHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, databaseName, factory, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    public List<JenkinsServer> getJenkinsServers() {
        return new ArrayList<JenkinsServer>();
    }

    public JenkinsServer getServerInfo(int serverId) {
        return null;
    }

    public Long saveJenkinsServer(JenkinsServer server1) {
        Long id = server1.save();
        Log.d(this.getClass().getSimpleName(), "Saved new server with id = " + id);
        return id;
    }
}
