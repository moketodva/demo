package com.test.annotation.IOC.Import;

import com.test.annotation.IOC.School;
import com.test.annotation.IOC.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author moke
 */
public class ImportTest {
    
    @Bean("thirdStudent")
    public Student student(@Qualifier("thirdSchool") School school){
        Student student = new Student();
        student.setName("moke");
        student.setSchool(school);
        return student;
    }

    @Bean("thirdSchool")
    public School school(){
        School school = new School();
        school.setName("XX学校");
        return school;
    }
}
