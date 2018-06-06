package com.mylearning.newLearnings.scope.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class MyLearningService {
    
    private String learningName = "learning name";
    
    public String getProcessLearningName(){
        return learningName;
    }
    
    public void setProcessLearningName(String name) {
        this.learningName = name;
    }
}
