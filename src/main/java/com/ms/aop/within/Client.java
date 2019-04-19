package com.ms.aop.within;

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
        IService service = annotationConfigApplicationContext.getBean(IService.class);
        service.m1();
    }
}
