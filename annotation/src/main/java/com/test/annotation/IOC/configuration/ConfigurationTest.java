package com.test.annotation.IOC.configuration;

import com.test.annotation.IOC.School;
import com.test.annotation.IOC.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author moke
 */
@Configuration
public class ConfigurationTest {

    @Bean("secondStudent")
    public Student student(@Qualifier("secondSchool") School school){
        Student student = new Student();
        student.setName("moke");
        student.setSchool(school);
        return student;
    }

    @Bean("secondSchool")
    public School school(){
        School school = new School();
        school.setName("XX学校");
        return school;
    }
}
