package org.bostijancic.android.serge.jenkins.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * emil on 09/03/14.
 */
@Table(name = "JenkinsServer")
public class JenkinsServer extends Model {
    @Column(name = "Mode")
    public String mode = "NORMAL";

    @Column(name = "NodeDescription")
    public String nodeDescription;

    @Column(name = "NodeName")
    public String nodeName;

    @Column(name = "NoExecutors")
    public Integer noExecutors;

    @Column(name = "Description")
    public String description;

    @Column(name = "QuietingDown")
    public Boolean quietingDown = false;

    @Column(name = "SlaveAgentPort")
    public Integer slaveAgentPort;

    @Column(name = "UseCrumbs")
    public Boolean useCrumbs = false;

    @Column(name = "UseSecurity")
    public Boolean useSecurity = false;
}
