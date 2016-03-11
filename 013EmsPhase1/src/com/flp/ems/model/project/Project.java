package com.flp.ems.model.project;

import java.io.Serializable;

public class Project implements Serializable{
	private static final long serialVersionUID = -7148420086874141956L;
	private int projectId;
	private String projectName;
	private String projectDesc;
	private int deptId;
	private static int numId;
//static init block
	static
	{
		numId=10+(int)(Math.random()*222);
	}
//init block
	{
		projectId=getNumId();
	}
	public Project() {
		// TODO Auto-generated constructor stub
	}
	public Project(String projectName, String projectDesc,
			int deptId) {
		super();
		this.projectName = projectName;
		this.projectDesc = projectDesc;
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
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public static int getNumId() {
		return numId++;
	}
	public static void setNumId(int numId) {
		Project.numId = numId;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projectDesc=" + projectDesc + ", deptId="
				+ deptId + "]";
	}
	
}
