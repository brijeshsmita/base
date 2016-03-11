package com.cg.project.services;

import com.cg.exception.EmsException;
import com.cg.project.domain.Project;

import java.util.ArrayList;


public interface IProjectService {

	void addProject(Project p)throws EmsException ;
	void removeProject(int projectId)throws EmsException ;
	Project modifyProject(Project p)throws EmsException ;
	Project searchProject(int projectId) throws EmsException ;
	ArrayList<Project> listAllProject()throws EmsException ;
	void showAllProjectId()throws EmsException ;
	
	
}
