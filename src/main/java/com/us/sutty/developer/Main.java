package com.us.sutty.developer;

import com.us.sutty.developer.domain.Developer;
import com.us.sutty.developer.domain.Project;
import com.us.sutty.developer.repository.DeveloperDAO;
import com.us.sutty.developer.repository.DeveloperDAOMySQLImpl;
import com.us.sutty.developer.repository.ProjectDAO;
import com.us.sutty.developer.repository.ProjectDAOMySQLImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        DeveloperDAO developerDAO = new DeveloperDAOMySQLImpl();
        ProjectDAO projectDAO = new ProjectDAOMySQLImpl();

//        Developer developer1 = Developer.builder()
//                .firstName("Ivan1")
//                .lastName("Ivanov1")
//                .build();
//        Developer developer2 = Developer.builder()
//                .firstName("Ivan2")
//                .lastName("Ivanov2")
//                .build();
//        Developer developer3 = Developer.builder()
//                .firstName("Ivan3")
//                .lastName("Ivanov3")
//                .build();
//
//        Project project1 = Project.builder()
//                .name("Android app1")
//                .build();
//        Project project2 = Project.builder()
//                .name("Android app2")
//                .build();
//        Project project3 = Project.builder()
//                .name("Android app3")
//                .build();
//
//        developerDAO.addDeveloper(developer1);
//        developerDAO.addDeveloper(developer2);
//        developerDAO.addDeveloper(developer3);
//        projectDAO.addProject(project1);
//        projectDAO.addProject(project2);
//        projectDAO.addProject(project3);

        Developer developer1 = developerDAO.getDeveloper(2);
        Developer developer2 = developerDAO.getDeveloper(3);
        Developer developer3 = developerDAO.getDeveloper(4);
        Project project1 = projectDAO.getProject(4);
//        Project project2 = projectDAO.getProject(3);
//        Project project3 = projectDAO.getProject(4);
//        developer.getProjects().add(project);
//        developer.setProjects(Collections.singletonList(project));

//        List<Project> projects = Arrays.asList(project1, project2, project3);
//        developer.setProjects(projects);
        List<Developer> developers = Arrays.asList(developer1, developer2, developer3);
        project1.setDevelopers(developers);
        projectDAO.updateProject(project1);
//        developerDAO.updateDeveloper(developer);

    }

}
