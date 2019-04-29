package com.ms.aop.jtarget;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Annotation1
public abstract class Service {
    public void m1() {
        log.info("切入点@target测试！");
    }
}
