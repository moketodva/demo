package com.test.annotation.Resource.configurationProperties;


import com.test.annotation.Resource.School;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

/**
 * @author moke
 */
@Configuration
@ConfigurationProperties(prefix = "student")
public class ConfigurationPropertiesTest {

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
        return "ConfigurationPropertiesTest{" +
                "name='" + name + '\'' +
                ", scores=" + scores +
                ", projects=" + projects +
                ", school=" + school +
                '}';
    }
}
