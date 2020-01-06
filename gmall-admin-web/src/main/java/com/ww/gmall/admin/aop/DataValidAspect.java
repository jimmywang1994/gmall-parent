package com.ww.gmall.admin.aop;

import com.ww.gmall.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * 利用aop完成统一数据校验，校验出错就返回前端提示
 **/
@Slf4j
@Aspect
@Component
public class DataValidAspect {

    @Around("execution(* com.ww.gmall.admin..*Controller.*(..))")
    public Object validAround(ProceedingJoinPoint point) {
        Object proceed = null;
        try {
            Object[] args = point.getArgs();
            for (Object arg : args) {
                if (arg instanceof BindingResult) {
                    BindingResult r = (BindingResult) arg;
                    int errorCount = r.getErrorCount();
                    if (errorCount > 0) {
                        return new CommonResult().validateFailed(r);
                    }
                }
            }
            log.debug("校验切面介入工作...");
            //就是反射的method.invoke()
            proceed = point.proceed(point.getArgs());
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
        return proceed;
    }
}
