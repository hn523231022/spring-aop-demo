package com.ms.aop.jannotation.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

@ComponentScan(basePackageClasses = {Client.class})
@EnableAspectJAutoProxy
public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Client.class);
        Service service = annotationConfigApplicationContext.getBean(Service.class);
        service.m1();
        Method m1 = ServiceImpl.class.getDeclaredMethod("m1");
        Arrays.stream(m1.getAnnotations()).forEach(System.out::println);
    }
}
