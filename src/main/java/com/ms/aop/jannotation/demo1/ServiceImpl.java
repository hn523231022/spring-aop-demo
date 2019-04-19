package com.ms.aop.jannotation.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceImpl implements IService {
    @Override
    @Annotation1
    public void m1() {
        log.info("切入点annotation测试！");
    }
}
