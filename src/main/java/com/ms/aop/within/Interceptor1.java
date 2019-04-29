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
 * <b>author</b>：十年java老兵，只生产干货，公众号：路人甲Java，微信号：itsoku
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
