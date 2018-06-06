package com.mylearning.newLearnings.scope.component;

import org.springframework.stereotype.Component;

@Component
public class ScopeComponent {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
