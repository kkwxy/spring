package com.example.demo.web.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AopConfig {

    private static final Logger logger = LogManager.getLogger();

    /**
     * 配置切入点
     */
    @Pointcut("execution(* com.example.demo.web.service.*.*(..))")
    public void apoPointCut() {
        // 无方法体，主要在@Pointct中体现@AopTest注解类所在位置
    }

    /**
     * 配置环绕通知
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("apoPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("================================切点日志.........................");
        // 方法执行
        return joinPoint.proceed();
    }


    /**
     * 配置异常通知
     *
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(pointcut = "apoPointCut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        // 对应业务处理
        // do something..
    }
}
