package com.ms.aop.within;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/19 8:37 <br>
 * <b>author</b>：ready likun_557@163.com
 */
@Aspect
@Component
@Slf4j
public class Interceptor1 {

    @Pointcut("within(com.ms.aop.within.*)")
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
