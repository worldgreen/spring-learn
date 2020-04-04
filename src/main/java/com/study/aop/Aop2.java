package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Aop2 {

    @Pointcut("execution(* *.test(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void beforeTest() {
        System.out.println("before 2");
    }


    @Around("pointCut()")
    public Object testArount(ProceedingJoinPoint point) throws Throwable {
        Object res = null;
        System.out.println("arount before 2");
        res = point.proceed();
        System.out.println("arount end 2");
        return res;
    }
}