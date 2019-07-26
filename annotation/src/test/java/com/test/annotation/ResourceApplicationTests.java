package com.test.annotation;

import com.test.annotation.Resource.configurationProperties.ConfigurationPropertiesTest;
import com.test.annotation.Resource.importResource.ImportResourceTest;
import com.test.annotation.Resource.propertySource.PropertySourceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author moke
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceApplicationTests {

    @Resource
    private ConfigurationPropertiesTest configurationPropertiesTest;

    @Resource
    private ImportResourceTest importResourceTest;

    @Resource
    private PropertySourceTest propertySourceTest;


    @Test
    public void configurationPropertiesTest(){
        System.out.println(configurationPropertiesTest);
    }

    @Test
    public void importResourceTest(){
        System.out.println(importResourceTest);
    }

    @Test
    public void propertySourceTest(){
        System.out.println(propertySourceTest);
    }
}
