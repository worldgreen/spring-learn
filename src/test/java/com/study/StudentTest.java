package com.study;

import com.study.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    Boolean t;

    @Test
    public void tesGetName() {
        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) bf.getBean("studentService");
        studentService.getName();
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