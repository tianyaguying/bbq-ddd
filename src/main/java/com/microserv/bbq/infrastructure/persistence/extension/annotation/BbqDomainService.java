package com.microserv.bbq.infrastructure.persistence.extension.annotation;

import java.lang.annotation.*;

/**
 * 领域模型标记-领域服务
 *
 * @author jockeys
 * @date 2020/9/26
 */
@Retention(RetentionPolicy.SOURCE)  //设置SOURCE相当与注释作用
@Documented
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface BbqDomainService {
}
