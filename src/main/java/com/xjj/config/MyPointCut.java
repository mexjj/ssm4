package com.xjj.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointCut {

    @Pointcut("execution(* *..*.*(..))")
    public void PointCut(){}

    @Before("PointCut()")
    public void beforeTest(){
        System.out.println("-----前前前前前前前前前前前前前前前----------");
    }

    /*@Around("PointCut()")
    public Object pjtest(ProceedingJoinPoint proceedingJoinPoint){
        Object oj = new Object();
        try {
            System.out.println("-----前置通知-----");
            oj = proceedingJoinPoint.proceed();
            System.out.println("-----后置通知-----");
            return oj;
        }catch (Throwable e){
            System.out.println("-----异常通知-----");
            e.printStackTrace();
            return oj;
        }finally {
            System.out.println("-----最终通知-----");
            return oj;
        }
    }*/

}
