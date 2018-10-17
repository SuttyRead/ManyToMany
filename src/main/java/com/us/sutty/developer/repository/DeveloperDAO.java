package com.us.sutty.developer.repository;

import com.us.sutty.developer.domain.Developer;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface DeveloperDAO {

    void addDeveloper(Developer developer);

    void removeDeveloper(long id);

    Developer getDeveloper(long id);

    void updateDeveloper(Developer developer);

    List<Developer> getAllDevelopers();

}
