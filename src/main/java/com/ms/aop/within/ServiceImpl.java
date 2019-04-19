package com.ms.aop.within;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/19 8:34 <br>
 * <b>author</b>：ready likun_557@163.com
 */
@Slf4j
@Component
public class ServiceImpl implements IService {
    @Override
    public void m1() {
        log.info("切入点within测试！");
    }
}
