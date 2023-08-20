package com.example.scope.myComponent;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author : KaelvihN
 * @date : 2023/8/19 19:50
 */

@Scope(WebApplicationContext.SCOPE_APPLICATION)
@Slf4j
@Component
public class BeanForApplication {
    @PreDestroy
    public void destroy() {
        log.info("BeanForApplication 调用 destroy()");
    }
}
