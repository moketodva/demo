package com.test.annotation.DI.autowired;

import com.test.annotation.DI.Test;
import com.test.annotation.DI.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author moke
 */
@Component
public class AutowiredTest implements Test {

    @Autowired
    private TestBean testBean;

    @Autowired
    @Qualifier("testBean")
    private TestBean randomName;

    @Override
    public void test(){
        System.out.println("--> Autowired <--");
        testBean.say();
    }

    @Override
    public void testRrandom(){
        System.out.println("--> Autowired <--");
        randomName.say();
    }
}
