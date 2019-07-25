package com.test.annotation.DI;

import org.springframework.stereotype.Component;

/**
 * @author moke
 */
@Component
public class TestBean {

    private final String name = "moke";

    public void say(){
        System.out.println(name + "：hello world！");
    }
}
