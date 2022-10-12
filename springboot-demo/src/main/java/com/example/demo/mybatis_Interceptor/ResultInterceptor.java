package com.example.demo.mybatis_Interceptor;

import com.example.demo.web.entity.Order;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

@Intercepts({
        @Signature(type = ResultSetHandler.class, method = "handleResultSets", args = {Statement.class})
})
@Component
public class ResultInterceptor implements Interceptor {
    private static final Logger logger = LogManager.getLogger(ResultInterceptor.class);


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //logger.info("================================mybatis ResultSetHandler拦截................................start");
        Object obj = invocation.proceed();
        if(obj instanceof ArrayList){
            List<Object> orders = (ArrayList)obj;
            Order order = new Order();
            order.setUserId(100001);
            order.setCtime(new Date());
            orders.add(order);
        }
        logger.info("================================mybatis ResultSetHandler拦截 obj:{}", obj);
        //logger.info("================================mybatis ResultSetHandler拦截................................end");
        return obj;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}