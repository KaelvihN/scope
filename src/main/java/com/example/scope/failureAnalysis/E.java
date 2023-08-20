package com.example.scope.failureAnalysis;

import jakarta.annotation.Resource;
import lombok.Getter;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


/**
 * @author : KaelvihN
 * @date : 2023/8/20 15:19
 */

@Component
@Getter
public class E {
    @Resource
    @Lazy
    private F1 f1;

    @Resource

    private F2 f2;

    @Resource
    private ObjectFactory<F3> f3ObjectFactory;

    public F3 getF3() {
        return f3ObjectFactory.getObject();
    }

    @Resource
    private ApplicationContext context;

    public F4 getF4() {
        return context.getBean(F4.class);
    }
}
