package com.us.sutty.developer.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "developers_projects",
            //foreign key for CarsEntity in employee_car table
            joinColumns = @JoinColumn(name = "developer_id"),
            //foreign key for other side - EmployeeEntity in employee_car table
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects;

//    public void setProjects(List<Project> projects) {
//        this.projects = projects;
//    }
//
    public void addProject(Project project) {
        projects.add(project);
    }

}
