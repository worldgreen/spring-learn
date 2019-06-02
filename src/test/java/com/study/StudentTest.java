package com.study;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentTest {

    @Test
    public void tesGetName() {
        XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Student st = (Student) bf.getBean("student");
        Assert.assertEquals("whe", st.getName());
        System.out.println(st.getName());
    }


}