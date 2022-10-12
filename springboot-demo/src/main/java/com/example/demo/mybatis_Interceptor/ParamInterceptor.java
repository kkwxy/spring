package com.example.demo.mybatis_Interceptor;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * ParameterHandler 拦截器实现
 */
@Intercepts({
        @Signature(type = ParameterHandler.class, method = "setParameters", args = PreparedStatement.class),
})
@Component
public class ParamInterceptor implements Interceptor {
    private static final Logger logger = LogManager.getLogger(ParamInterceptor.class);


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //logger.info("================================mybatis ParameterHandler拦截................................start");
        if (invocation.getTarget() instanceof ParameterHandler) {
            ParameterHandler parameterHandler = (ParameterHandler) invocation.getTarget();
            PreparedStatement ps = (PreparedStatement) invocation.getArgs()[0];
            // 反射获取 BoundSql 对象，此对象包含生成的sql和sql的参数map映射
            //Field boundSqlField = parameterHandler.getClass().getDeclaredField("boundSql");
            //boundSqlField.setAccessible(true);
            //BoundSql boundSql = (BoundSql) boundSqlField.get(parameterHandler);
            // 反射获取 参数对像
            Field parameterField = parameterHandler.getClass().getDeclaredField("parameterObject");
            parameterField.setAccessible(true);
            Object parameterObject = parameterField.get(parameterHandler);
            logger.info("================================mybatis ParameterHandler拦截....parameterObject : {}",parameterObject);
            if (parameterObject instanceof String) {
                if(parameterObject.equals("2")){
                    //将参数中的name值改为2
                    parameterObject = "1";
                }
            }
            logger.info("================================mybatis ParameterHandler拦截....parameterObject UPDATE : {}",parameterObject);
            // 改写的参数设置到原parameterHandler对象
            parameterField.set(parameterHandler, parameterObject);
            parameterHandler.setParameters(ps);
        }
        //logger.info("================================mybatis ParameterHandler拦截................................end");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}