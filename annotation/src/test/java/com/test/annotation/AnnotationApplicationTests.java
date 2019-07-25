package com.test.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationApplicationTests {

    @Resource
    private com.test.annotation.DI.Test autowiredTest;

    @Resource
    private com.test.annotation.DI.Test injectTest;

    @Resource
    private com.test.annotation.DI.Test resourceTest;

    @Test
    public void DIAutowired() {
        autowiredTest.test();
    }

    @Test
    public void DIInject() {
        injectTest.test();
    }

    @Test
    public void DIResource() {
        resourceTest.test();
    }

    @Test
    public void DIAutowiredRandom() {
        autowiredTest.testRrandom();
    }

    @Test
    public void DIInjectRandom() {
        injectTest.testRrandom();
    }

    @Test
    public void DIResourceRandom() {
        resourceTest.testRrandom();
    }
}
