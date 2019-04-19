package com.ms.aop.jwithin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Service {
    public void m1() {
        log.info("切入点@within测试！");
    }
}
