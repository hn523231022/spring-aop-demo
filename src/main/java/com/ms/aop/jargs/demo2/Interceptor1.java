package com.ms.aop.jargs.demo2;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class Interceptor1 {

    @Pointcut("@args(com.ms.aop.jargs.demo2.Anno1,..)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object invoke(ProceedingJoinPoint invocation) throws Throwable {
        log.info("方法执行之前");
        Object result = invocation.proceed();
        log.info("方法执行完毕");
        return result;
    }
}
