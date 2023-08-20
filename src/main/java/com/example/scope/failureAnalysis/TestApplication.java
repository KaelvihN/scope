package com.example.scope.failureAnalysis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : KaelvihN
 * @date : 2023/8/20 15:20
 */

@Slf4j
@ComponentScan("com.example.scope.failureAnalysis")
public class TestApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestApplication.class);
        E e = context.getBean(E.class);
        log.info(e.getF1().toString());
        log.info(e.getF1().toString());
        log.info(e.getF1().toString());
        log.info(e.getF2().toString());
        log.info(e.getF2().toString());
        log.info(e.getF2().toString());
        log.info(e.getF3().toString());
        log.info(e.getF3().toString());
        log.info(e.getF3().toString());
        log.info(e.getF4().toString());
        log.info(e.getF4().toString());
        log.info(e.getF4().toString());
        context.close();
    }
}
