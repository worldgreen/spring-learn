package com.study;

import com.study.model.T1;
import com.study.service.T1Service;
import com.study.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class StudentTest {

    Boolean t;
    int i;

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

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1,1);
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(1,2);

        int i =  Integer.numberOfLeadingZeros(0x7fffffff);
        System.out.println(i);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}