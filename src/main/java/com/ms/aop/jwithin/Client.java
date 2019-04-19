package com.ms.aop.jwithin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@ComponentScan(basePackageClasses = {Client.class})
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Client.class);
        Service service = annotationConfigApplicationContext.getBean(Service.class);
        service.m1();

        Arrays.stream(ServiceImpl.class.getAnnotations()).forEach(System.out::println);
    }
}
