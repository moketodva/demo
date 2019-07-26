package com.test.annotation.Resource.importResource;


import com.test.annotation.Resource.School;

import java.util.List;
import java.util.Map;

/**
 * @author moke
 */
public class ImportResourceTest {

    private String name;

    private Map<String, String> scores;

    private List<String> projects;

    private School school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getScores() {
        return scores;
    }

    public void setScores(Map<String, String> scores) {
        this.scores = scores;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "ImportResourceTest{" +
                "name='" + name + '\'' +
                ", scores=" + scores +
                ", projects=" + projects +
                ", school=" + school +
                '}';
    }
}
