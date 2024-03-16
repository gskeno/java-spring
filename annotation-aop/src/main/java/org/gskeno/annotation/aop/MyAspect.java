package org.gskeno.annotation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* org.gskeno.annotation.aop.UserService.*(..))")
    @AfterReturning
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("before invoke " + joinPoint.getSignature().getName());
    }
}
