package com.ms.aop.args.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceImpl implements IService {
    @Override
    public void m1(UserModel user) {
        log.info("切入点args测试！");
        log.info("{}", user);
    }
}
