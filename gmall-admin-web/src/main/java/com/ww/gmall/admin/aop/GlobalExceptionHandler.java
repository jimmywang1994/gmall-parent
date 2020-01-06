package com.ww.gmall.admin.aop;

import com.ww.gmall.to.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理，返回500的json字符串
 * 当有环绕通知的时候，目标方法出现的异常一定要向上抛出
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 数学异常处理器
     * @param ex
     * @return
     */
    @ExceptionHandler(value = {ArithmeticException.class})
    public Object handlerException(Exception ex) {
        log.error("全局异常感知,信息:{}",ex.getStackTrace());
        return new CommonResult().validateFailed("数学没学好");
    }

    /**
     * 空指针异常处理器
     * @param ex
     * @return
     */
    @ExceptionHandler(value = {NullPointerException.class})
    public Object nullPointHandlerException(Exception ex) {
        log.error("全局异常感知,信息:{}",ex.getStackTrace());
        return new CommonResult().validateFailed("空指针了");
    }


}
