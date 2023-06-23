package com.yzero.java.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: Log
 * Package: com.yzero.java.aop
 * Description:
 *
 * @author zjzstart
 * @create 2023-06-09 11:14
 */
@Aspect
@Component
public class Log {

    @Pointcut(value = "execution(* com.yzero.java.controller.LonginController.t(..))")
    public void cut(){}

    @Before(value = "cut()")
    public void before(){
        System.out.println("前置通知");
    }
//    @Around(value = "cut()")
//    public void around() throws Throwable{
//        System.out.println("huanqian");
//        cut();
//        System.out.println("huanhou");
//    }

}
