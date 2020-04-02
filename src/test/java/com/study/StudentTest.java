package com.study;

import com.study.dao.T1Mapper;
import com.study.model.T1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    Boolean t;

    @Test
    public void tesGetName() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
        T1Mapper t1Mapper = (T1Mapper) bf.getBean("t1Mapper");
        T1 t1 = t1Mapper.get(1);
        System.out.println();
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