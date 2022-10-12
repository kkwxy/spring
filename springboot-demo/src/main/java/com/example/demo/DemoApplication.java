package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.DebuggingClassWriter;

@SpringBootApplication
@MapperScan("com.example.demo.web.dao")
public class DemoApplication {

    public static void main(String[] args) {
        //-Dsun.misc.ProxyGenerator.saveGeneratedFiles=true
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "..\\springboot-demo\\class");
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SpringApplication.run(DemoApplication.class, args);
    }

}
