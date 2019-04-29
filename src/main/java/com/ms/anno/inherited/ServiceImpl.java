package com.ms.anno.inherited;

import com.ms.aop.execution.IServiceA;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/28 10:19 <br>
 * <b>author</b>：十年java老兵，只生产干货，公众号：路人甲Java，微信号：itsoku
 */
public class ServiceImpl extends AService implements IService {
    @Override
    void m1() {
        super.m1();
    }
}