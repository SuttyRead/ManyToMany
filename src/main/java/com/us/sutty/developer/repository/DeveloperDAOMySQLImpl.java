package com.us.sutty.developer.repository;

import com.us.sutty.developer.domain.Developer;
import com.us.sutty.developer.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class DeveloperDAOMySQLImpl implements DeveloperDAO {


    @Override
    public void addDeveloper(Developer developer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(developer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeDeveloper(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        session.remove(developer);
        session.getTransaction();
        session.close();
    }

    @Override
    public Developer getDeveloper(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Developer developer = session.get(Developer.class, id);
        session.getTransaction();
        session.close();
        return developer;
    }

    @Override
    public void updateDeveloper(Developer developer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(developer);
        session.getTransaction().commit();
        session.close();
    }

    @SuppressWarnings(value = "unchecked")
    @Override
    public List<Developer> getAllDevelopers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Developer> developers = session.createQuery("FROM Developer ").list();
        session.getTransaction().commit();
        session.close();
        return developers;
    }

}
