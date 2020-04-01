package com.study;

import com.study.model.T1;
import com.study.service.T1Service;
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
        t1.setId(2);
        t1.setName("wht");
        t1Service.save(t1);
    }

    public static void main(String[] args) {
        Long t = 1l;
        System.out.println(t.equals(1l));
    }
}

    class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
}