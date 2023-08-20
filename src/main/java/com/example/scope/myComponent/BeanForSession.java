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

@Scope(WebApplicationContext.SCOPE_SESSION)
@Slf4j
@Component
public class BeanForSession {
    @PreDestroy
    public void destroy() {
        log.info("BeanForSession 调用 destroy()");
    }
}
