package com.ms.aop.execution;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/19 8:41 <br>
 * <b>author</b>：ready likun_557@163.com
 */
@ComponentScan(basePackageClasses={Client.class})
@EnableAspectJAutoProxy
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Client.class);
        IServiceA service = annotationConfigApplicationContext.getBean(IServiceA.class);
        service.m2();
    }
}
