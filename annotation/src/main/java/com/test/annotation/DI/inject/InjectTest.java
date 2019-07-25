package com.test.annotation.DI.inject;

import com.test.annotation.DI.Test;
import com.test.annotation.DI.TestBean;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author moke
 */
@Component
public class InjectTest implements Test {

    @Inject
    private TestBean testBean;

    @Inject
    @Named("testBean")
    private TestBean randomName;

    @Override
    public void test(){
        System.out.println("--> Inject <--");
        testBean.say();
    }

    @Override
    public void testRrandom(){
        System.out.println("--> Autowired <--");
        randomName.say();
    }
}
