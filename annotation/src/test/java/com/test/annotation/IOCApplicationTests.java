package com.test.annotation;

import com.test.annotation.IOC.Import.ImportTest;
import com.test.annotation.IOC.School;
import com.test.annotation.IOC.Student;
import com.test.annotation.IOC.component.ComponentTest;
import com.test.annotation.IOC.configuration.ConfigurationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author moke
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(ImportTest.class)
public class IOCApplicationTests {

    @Resource
    private ComponentTest componentTest;

    @Resource
    private ConfigurationTest configurationTest;

    @Resource
    private ImportTest importTest;

    @Resource
    private Student firstStudent;

    @Resource
    private Student secondStudent;

    @Resource
    private Student thirdStudent;

    @Resource
    private School firstSchool;

    @Resource
    private School secondSchool;

    @Resource
    private School thirdSchool;

    @Test
    public void componentTest(){
        System.out.println(firstStudent);
        System.out.println(firstSchool);
        System.out.println(componentTest.student(componentTest.school()) == firstStudent);
        System.out.println(componentTest.school() == firstSchool);
    }

    @Test
    public void configurationTest(){
        System.out.println(secondStudent);
        System.out.println(secondSchool);
        System.out.println(configurationTest.student(configurationTest.school()) == secondStudent);
        System.out.println(configurationTest.school() == secondSchool);
    }

    @Test
    public void importTest(){
        System.out.println(thirdStudent);
        System.out.println(thirdSchool);
        System.out.println(importTest.student(importTest.school()) == thirdStudent);
        System.out.println(importTest.school() == thirdSchool);
    }
}
