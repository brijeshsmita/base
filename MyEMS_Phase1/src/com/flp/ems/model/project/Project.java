package com.flp.ems.model.project;

public class Project {
	private int projectId;
	private int deptId;
	private String projectName;
	private String projectDesc;
	private static int numId;
	static{
		numId=1000+(int) (Math.random()*0.034);
	}
	//INIT
	{
		projectId=getNumId();
	}
	//DEFAULT CONSTRUCTOR
	public Project() {
	}
	//OVER LOADED CONSTRUCTOR
	public Project(int deptId, String projectName, String projectDesc) {
		super();
		this.deptId = deptId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
	}
	//TO STRING
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", deptId=" + deptId
				+ ", projectName=" + projectName + ", projectDesc="
				+ projectDesc + "]";
	}
	//GETTER
	public int getProjectId() {
		return projectId;
	}
	public int getDeptId() {
		return deptId;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public static int getNumId() {
		return numId;
	}
	//SETTER
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
}//end of project
