package com.ms.aop.jthis.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceImpl implements IService {
    @Override
    public void m1() {
        log.info("切入点this测试！");
    }
}
