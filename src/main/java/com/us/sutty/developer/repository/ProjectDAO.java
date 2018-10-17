package com.us.sutty.developer.repository;

import com.us.sutty.developer.domain.Developer;
import com.us.sutty.developer.domain.Project;

import java.util.List;

public interface ProjectDAO {

    void addProject(Project project);

    void removeProject(long id);

    Project getProject(long id);

    void updateProject(Project project);

    List<Project> getAllProjects();

}
