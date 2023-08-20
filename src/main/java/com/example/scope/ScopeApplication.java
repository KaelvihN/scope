package com.example.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Scope:
 * 1.Singleton 同一个name获取同一个Bean
 * 2.Prototype 每次获取都都是新的Bean
 * 3.Request 请求域
 * 4.Session  Session域
 * 5.Application 程序域===>此处所指为Web中的Context
 */

@SpringBootApplication
public class ScopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScopeApplication.class, args);


    }

}
