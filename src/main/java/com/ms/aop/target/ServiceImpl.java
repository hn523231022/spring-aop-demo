package com.ms.aop.target;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceImpl implements IService {
    @Override
    public void m1() {
        log.info("切入点target测试！");
    }
}
