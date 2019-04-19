package com.ms.aop.jargs.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.UUID;

@ComponentScan(basePackageClasses = {Client.class})
@EnableAspectJAutoProxy
public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Client.class);
        IService service = annotationConfigApplicationContext.getBean(IService.class);
        service.m1(User.builder().name(UUID.randomUUID().toString()).build(), "");
    }
}
