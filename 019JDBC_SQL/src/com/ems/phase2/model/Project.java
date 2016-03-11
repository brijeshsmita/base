package com.ems.phase2.model;

import java.io.Serializable;

public class Project implements Serializable {
	private static final long serialVersionUID = 6404110518899992745L;
	private int projectId;
	private String projectName;
	private String projDesc;
	private int deptId;
	//no-Arg constructor
	public Project() {
		System.out.println("Project created");
	}
	public Project(int projectId, String projectName, String projDesc,
			int deptId) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projDesc = projDesc;
		this.deptId = deptId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projDesc=" + projDesc + ", deptId=" + deptId
				+ "]";
	}	
}
