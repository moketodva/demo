package com.test.annotation.DI.resource;

import com.test.annotation.DI.Test;
import com.test.annotation.DI.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author moke
 */
@Component
public class ResourceTest implements Test {

    @Resource
    private TestBean testBean;

    @Resource
    private TestBean randomName;

    @Override
    public void test(){
        System.out.println("--> Resource <--");
        testBean.say();
    }

    @Override
    public void testRrandom(){
        System.out.println("--> Autowired <--");
        randomName.say();
    }
}
