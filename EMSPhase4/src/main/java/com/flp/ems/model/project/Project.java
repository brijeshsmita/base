//Step 1 : Package declaration
package com.flp.ems.model.project;
//Step 2 : none or many import statements
//Step 3 : public class
public class Project {
	//Step 4 : Private member variables
	private int projectId;
	private String projectName;
	private String projectDesc;
	private int deptId;
	private static int numId;
	//Step 5 : Static block
	//static init block
	//step 6 : No-Arguments Constructor
	public Project() {
		
	}
	//step 7 : Overloaded Constructor
	public Project(String projectName, String projectDesc, int deptId) {
		super();
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.deptId = deptId;
	}
	//step 8 : getters and setters
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
		return ++numId;
	}
	public static void setNumId(int numId) {
		Project.numId = numId;
	}
	//step 10 : override toString() method
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName="
				+ projectName + ", projectDesc=" + projectDesc + ", deptId="
				+ deptId + "]";
	}//end of toString
}//end of class
