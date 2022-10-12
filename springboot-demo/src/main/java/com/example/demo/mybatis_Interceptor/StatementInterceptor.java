package com.example.demo.mybatis_Interceptor;

import com.baomidou.mybatisplus.core.toolkit.PluginUtils;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Properties;

@Intercepts(
        {@Signature(
                type = StatementHandler.class,
                method = "prepare",
                args = {Connection.class, Integer.class}
        )
        })
@Component
public class StatementInterceptor implements Interceptor {
    private static final Logger logger = LogManager.getLogger(StatementInterceptor.class);


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //logger.info("================================mybatis StatementHandler拦截................................start");
        StatementHandler statementHandler =
                (StatementHandler) PluginUtils.realTarget(invocation.getTarget());
        MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
        MappedStatement mappedStatement =
                (MappedStatement) metaStatementHandler.getValue("delegate.mappedStatement");
        //只拦截select方法
        if (!SqlCommandType.SELECT.equals(mappedStatement.getSqlCommandType())) {
            return invocation.proceed();
        }
        BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
        //获取到sql
        String originalSql = boundSql.getSql();
        logger.info("================================mybatis StatementHandler拦截....originalSql：{}",originalSql);
        metaStatementHandler.setValue("delegate.boundSql.sql", originalSql + " and 1=1");
        Object parameterObject = boundSql.getParameterObject();
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