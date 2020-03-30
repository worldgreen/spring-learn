package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aop {

    @Pointcut("execution(* *.test(..))")
    public void pointCut() {}


    @Around("pointCut()")
    public Object testArount(ProceedingJoinPoint point) throws Throwable {
        Object res = null;
        System.out.println("arount before");
        res = point.proceed();
        System.out.println("arount end");
        return res;
    }
}
