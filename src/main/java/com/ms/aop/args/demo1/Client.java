package com.ms.aop.args.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackageClasses = {Client.class})
@EnableAspectJAutoProxy
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Client.class);
        IService service = annotationConfigApplicationContext.getBean(IService.class);
        service.m1(UserModel.builder().name("springaop").build());
    }
}
