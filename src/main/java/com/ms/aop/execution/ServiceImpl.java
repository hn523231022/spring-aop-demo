package com.ms.aop.execution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/19 8:34 <br>
 * <b>author</b>：十年java老兵，只生产干货，公众号：路人甲Java，微信号：itsoku
 */
@Slf4j
@Component
public class ServiceImpl implements IService, IServiceA {
    @Override
    public void m1() {
        log.info("切入点execution测试！");
    }

    @Override
    public void m2() {
        log.info("切入点execution测试！");
    }
}
