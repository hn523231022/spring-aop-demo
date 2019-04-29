package com.ms.anno.inherited;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/28 10:20 <br>
 * <b>author</b>：十年java老兵，只生产干货，公众号：路人甲Java，微信号：itsoku
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        Annotation[] annotations = ServiceImpl.class.getAnnotations();
        System.out.println("ServiceImpl 注解列表:");
        Arrays.stream(annotations).forEach(System.out::println);

        Annotation[] m1s = AService.class.getDeclaredMethod("m1").getAnnotations();
        System.out.println("AService#m1方法，注解列表:");
        Arrays.stream(m1s).forEach(System.out::println);

        m1s = ServiceImpl.class.getDeclaredMethod("m1").getAnnotations();
        System.out.println("ServiceImpl#m1方法，注解列表:");
        Arrays.stream(m1s).forEach(System.out::println);
    }
}