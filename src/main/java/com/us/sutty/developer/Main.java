package com.us.sutty.developer;

import com.us.sutty.developer.domain.Developer;
import com.us.sutty.developer.domain.Project;
import com.us.sutty.developer.repository.DeveloperDAO;
import com.us.sutty.developer.repository.DeveloperDAOMySQLImpl;
import com.us.sutty.developer.repository.ProjectDAO;
import com.us.sutty.developer.repository.ProjectDAOMySQLImpl;

public class Main {

    public static void main(String[] args) {


        DeveloperDAO developerDAO = new DeveloperDAOMySQLImpl();
        ProjectDAO projectDAO = new ProjectDAOMySQLImpl();

//        Developer developer1 = Developer.builder()
//                .firstName("Ivan")
//                .lastName("Ivanov")
//                .build();
//
//        Project project1 = Project.builder()
//                .name("Android app")
//                .build();
//
//
//        developerDAO.addDeveloper(developer1);
//        projectDAO.addProject(project1);

        Developer developer = developerDAO.getDeveloper(1);
        Project project = projectDAO.getProject(1);
        developer.getProjects().add(project);

    }

}
