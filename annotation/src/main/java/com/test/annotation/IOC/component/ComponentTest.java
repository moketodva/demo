package com.test.annotation.IOC.component;

import com.test.annotation.IOC.School;
import com.test.annotation.IOC.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author moke
 */
@Component
public class ComponentTest {

    @Bean("firstStudent")
    public Student student(@Qualifier("firstSchool") School firstSchool){
        Student student = new Student();
        student.setName("moke");
        student.setSchool(firstSchool);
        return student;
    }

    @Bean(value = "firstSchool")
    public School school(){
        School school = new School();
        school.setName("XX学校");
        return school;
    }
}
