package com.ww.gmall.admin.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 利用aop完成统一数据校验，校验出错就返回前端提示
 */
@Aspect
@Component
public class DataVaildAspect {
}
