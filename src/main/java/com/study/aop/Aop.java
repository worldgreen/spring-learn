package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;


@Aspect
public class Aop {

    @Pointcut("execution(* *.test(..))")
    private void pointCut(){}


    @Around("pointCut()")
    public Object aroundTest(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before");
        Object res = null;
        res = point.proceed();
        System.out.println("around end");
        return res;
    }

    public void print() {
        System.out.println();
    }

    public int longestCommonSubsequence(String text1, String text2) {
        String[][] dp = new String[text1.length() + 1][text2.length() + 1];
        for (int  i = 0; i < text1.length(); i++) {
            Arrays.fill(dp[i], "");
        }
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i+1][j+1] = dp[i][j] + text1.charAt(i);
                } else {
                    dp[i+1][j+1] = dp[i+1][j].length() > dp[i][j+1].length() ? dp[i+1][j] : dp[i][j+1];
                }
            }
        }
        return dp[text1.length()][text2.length()].length();
    }
}
