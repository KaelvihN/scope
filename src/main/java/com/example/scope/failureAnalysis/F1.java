package com.example.scope.failureAnalysis;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author : KaelvihN
 * @date : 2023/8/20 15:18
 */

/**
 * @Lazy测试
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class F1 {

}
