package com.test.annotation.Resource.propertySource;

import com.test.annotation.Resource.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author moke
 */
@Configuration
@PropertySource(value = {"classpath:propertySource.yml"}, encoding = "UTF-8", factory = MixPropertySourceFactory.class)
@ConfigurationProperties(prefix = "student-one")
public class PropertySourceTest {

    @Value("${student-one.name}")
    private String name;

    @Value("#{${student-one.scores}}")
    private Map<String, String> scores;

    @Value("#{'${student-one.projects}'.split(',')}")
    private List<String> projects;

    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "PropertySourceTest{" +
                "name='" + name + '\'' +
                ", scores=" + scores +
                ", projects=" + projects +
                ", school=" + school +
                '}';
    }
}
