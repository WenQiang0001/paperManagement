package com.example.papermanagementbe.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Pointcut("execution(public * com.example.papermanagementbe.controller..*Controller.*(..))")
    public void cutPoint(){
    //定义切点
    }
    @Around(value = "cutPoint()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //getSignature());是获取到这样的信息 :修饰符+ 包名+组件名(类名) +方法名
        //这里只需要方法名，故使用getSignature().getName()
        log.info("当前执行的方法为："+proceedingJoinPoint.getSignature().getName());
        //执行方法体
        Object proceed = proceedingJoinPoint.proceed();
        log.info("方法："+proceedingJoinPoint.getSignature().getName()+"执行完毕");
        return proceed;
    }
}
