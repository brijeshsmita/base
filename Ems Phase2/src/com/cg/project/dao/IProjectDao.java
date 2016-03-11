package com.cg.project.dao;

import java.util.ArrayList;

import com.cg.project.domain.Project;

public interface IProjectDao 
{
	void addProject(Project e);
	void removeProject(int empNo);
	Project modifyProject(Project e);
	Project searchProject(int empNo);
	ArrayList<Project> listAllProject();
	void showAllProjectId();
}
