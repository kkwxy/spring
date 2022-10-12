package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.DebuggingClassWriter;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //-Dsun.misc.ProxyGenerator.saveGeneratedFiles=true
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "..\\springboot-demo\\class");
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SpringApplication.run(DemoApplication.class, args);
    }

}
