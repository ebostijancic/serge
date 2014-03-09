package org.bostijancic.android.serge.jenkins.model;

import java.util.ArrayList;
import java.util.List;

/**
 * emil on 09/03/14.
 */
public class Jenkins {
    private List<String> assignedLables = new ArrayList<String>();
    private String mode = "NORMAL";
    private String nodeDescription;
    private String nodeName;
    private Integer nuExecutors;
    private String description;
    private List<JenkinsJob> jobs = new ArrayList<JenkinsJob>();
    private PrimaryView primaryView = new PrimaryView();
    private Boolean quietingDown = false;
    private Integer slaveAgentPort;
    private UnlabeledLoad unlabeledLoad = new UnlabeledLoad();
    private Boolean useCrumbs = false;
    private Boolean useSecurity = false;
    private List<JenkinsView> jenkinsViews = new ArrayList<JenkinsView>();


    public Jenkins() {
    }

    public List<String> getAssignedLables() {
        return assignedLables;
    }

    public void setAssignedLables(List<String> assignedLables) {
        this.assignedLables = assignedLables;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getNuExecutors() {
        return nuExecutors;
    }

    public void setNuExecutors(Integer nuExecutors) {
        this.nuExecutors = nuExecutors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<JenkinsJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<JenkinsJob> jobs) {
        this.jobs = jobs;
    }

    public PrimaryView getPrimaryView() {
        return primaryView;
    }

    public void setPrimaryView(PrimaryView primaryView) {
        this.primaryView = primaryView;
    }

    public Boolean getQuietingDown() {
        return quietingDown;
    }

    public void setQuietingDown(Boolean quietingDown) {
        this.quietingDown = quietingDown;
    }

    public Integer getSlaveAgentPort() {
        return slaveAgentPort;
    }

    public void setSlaveAgentPort(Integer slaveAgentPort) {
        this.slaveAgentPort = slaveAgentPort;
    }

    public UnlabeledLoad getUnlabeledLoad() {
        return unlabeledLoad;
    }

    public void setUnlabeledLoad(UnlabeledLoad unlabeledLoad) {
        this.unlabeledLoad = unlabeledLoad;
    }

    public Boolean getUseCrumbs() {
        return useCrumbs;
    }

    public void setUseCrumbs(Boolean useCrumbs) {
        this.useCrumbs = useCrumbs;
    }

    public Boolean getUseSecurity() {
        return useSecurity;
    }

    public void setUseSecurity(Boolean useSecurity) {
        this.useSecurity = useSecurity;
    }

    public List<JenkinsView> getJenkinsViews() {
        return jenkinsViews;
    }

    public void setJenkinsViews(List<JenkinsView> jenkinsViews) {
        this.jenkinsViews = jenkinsViews;
    }
}
