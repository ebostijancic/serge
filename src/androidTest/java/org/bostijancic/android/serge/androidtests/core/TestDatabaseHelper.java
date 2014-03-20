package org.bostijancic.android.serge.androidtests.core;

import android.test.InstrumentationTestCase;

import org.bostijancic.android.serge.jenkins.model.JenkinsServer;
import org.bostijancic.android.serge.jenkins.services.SergeDatabaseHelper;

/**
 * Created by ebostijancic on 18.03.14.
 */
public class TestDatabaseHelper extends InstrumentationTestCase {
    private SergeDatabaseHelper databaseHelper = null;

    @Override
    protected void setUp() throws Exception {
        databaseHelper = new SergeDatabaseHelper(getInstrumentation().getContext(), "serge.test.db", null, SergeDatabaseHelper.DATABASE_VERSION);
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testInsertData() {
        JenkinsServer server1 = new JenkinsServer();
        server1.mode ="mode";
        server1.description = "Server 1";
        server1.nodeDescription = "Server 1 Node";
        server1.nodeName = "server1";
        server1.noExecutors = 0;
        server1.quietingDown = false;
        server1.slaveAgentPort = 42;
        server1.useCrumbs = false;
        server1.useSecurity = false;

        // save the server information to database.
        Long serverId = databaseHelper.saveJenkinsServer(server1);
        assertTrue(serverId != 0);
    }
}
