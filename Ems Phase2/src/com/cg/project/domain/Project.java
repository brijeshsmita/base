package com.cg.project.domain;

public class Project 
{
	private int projectId;
	private String projectName;
	private String projectDescription;
	private int deptId;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName,
			String projectDescription, int deptId) {
		super();
		this.projectName = projectName;
		this.projectDescription = projectDescription;
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

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
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
				+ projectName + ", projectDescription=" + projectDescription
				+ ", deptId=" + deptId + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.projectId==obj.hashCode();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return projectId;
	}
	
	
	
	


	


}
