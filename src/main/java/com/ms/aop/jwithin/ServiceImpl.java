package com.ms.aop.jwithin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Annotation1
public class ServiceImpl extends Service {
    @Override
    public void m1() {
        super.m1();
    }
}
