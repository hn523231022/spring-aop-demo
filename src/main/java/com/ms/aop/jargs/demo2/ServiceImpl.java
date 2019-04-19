package com.ms.aop.jargs.demo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceImpl implements IService {
    @Override
    public void m1(User user, String s) {
        log.info("{}", user);
        log.info("切入点@args测试！");
    }
}
