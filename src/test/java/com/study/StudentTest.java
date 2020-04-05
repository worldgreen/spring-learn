package com.study;

import com.study.model.T1;
import com.study.service.T1Service;
import com.study.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    Boolean t;

    @Test
    public void tesGetName() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
        T1Service t1Service = (T1Service)bf.getBean("t1Service");
        T1 t1 = new T1();
        t1.setName("wht");
        t1Service.save(t1);
    }

    @Test
    public void tesAop() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService t1Service = (TestService)bf.getBean("testService");
        t1Service.test();
    }

}

    class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
}