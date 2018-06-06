package com.mylearning.newLearnings.scope.config;

import com.mylearning.newLearnings.scope.component.ScopeComponent;
import com.mylearning.newLearnings.scope.service.MyLearningService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

    @Bean("singleton")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MyLearningService myLearningService() {
        return new MyLearningService();
    }

    @Bean("prototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyLearningService myLearningService_prototype() {
        return new MyLearningService();
    }
}
