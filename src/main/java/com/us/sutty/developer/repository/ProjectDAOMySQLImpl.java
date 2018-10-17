package com.us.sutty.developer.repository;

import com.us.sutty.developer.domain.Developer;
import com.us.sutty.developer.domain.Project;
import com.us.sutty.developer.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ProjectDAOMySQLImpl implements ProjectDAO {

    @Override
    public void addProject(Project project) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(project);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeProject(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Project project = session.get(Project.class, id);
        session.remove(project);
        session.getTransaction();
        session.close();
    }

    @Override
    public Project getProject(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Project project = session.get(Project.class, id);
        session.getTransaction();
        session.close();
        return project;
    }

    @Override
    public void updateProject(Project project) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(project);
        session.getTransaction().commit();
        session.close();
    }

    @SuppressWarnings(value = "unchecked")
    @Override
    public List<Project> getAllProjects() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Project> projects = session.createQuery("FROM Project ").list();
        session.getTransaction().commit();
        session.close();
        return projects;
    }
}
