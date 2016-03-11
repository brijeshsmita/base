package com.ems.phase3.model;

import java.io.Serializable;

public class Project implements Serializable {
	private int projectId;
	private String projectName;
	private String projDesc;
	private int departmentId;
	private static int pid;
	
	static{
		pid=3001;
	}
	
	//init block
	{
		projectId=pid++;
	}
	
	//no-Arg constructor
	public Project() {
		System.out.println("Project created");
	}
	
	// overloaded constructor
	public Project(String projectName, String projDescription, int departmentId) {
		super();
		this.projectName = projectName;
		this.projDesc = projDesc;
		this.departmentId = departmentId;
	}

	//getters and setters
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

	public int getDepartmentId() {
		return departmentId;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projDesc=" + projDesc
				+ ", departmentId=" + departmentId + "]";
	}
	
	
	
	
	
	

}
