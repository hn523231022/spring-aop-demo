package com.ms.anno.inherited;

import java.lang.annotation.*;

/**
 * <b>description</b>： <br>
 * <b>time</b>：2019/4/28 10:18 <br>
 * <b>author</b>：十年java老兵，只生产干货，公众号：路人甲Java，微信号：itsoku
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Annotation2 {
}