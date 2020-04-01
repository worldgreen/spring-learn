package com.study;

import com.study.dao.T1Mapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    Boolean t;

    @Test
    public void tesGetName() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
        T1Mapper t1Mapper = (T1Mapper) bf.getBean("T1Mapper");
        t1Mapper.get(1);
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