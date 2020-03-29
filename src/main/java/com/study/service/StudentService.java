package com.study.service;

import org.springframework.transaction.annotation.Transactional;

public class StudentService {

    @Transactional
    public void getName() {
        System.out.println("before tx");
        throw new RuntimeException("tx");

    }
}
