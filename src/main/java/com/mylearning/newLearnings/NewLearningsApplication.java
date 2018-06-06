package com.mylearning.newLearnings;

import com.mylearning.newLearnings.scope.config.ScopeConfig;
import com.mylearning.newLearnings.scope.service.MyLearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class NewLearningsApplication {
//    @Autowired
//    MyLearningService service1;
    
    public static void main(String[] args) {
		SpringApplication.run(NewLearningsApplication.class, args);
        NewLearningsApplication newLearningsApplication = new NewLearningsApplication();
        newLearningsApplication.initiate();
	}
	
	void initiate() {
        singleton();
        prototype();
    }
	
    /**
     * singleton
     */
    void singleton() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        MyLearningService service1 = context.getBean("singleton",MyLearningService.class);
        service1.setProcessLearningName("name1");
        System.out.println(service1.getProcessLearningName());

        MyLearningService service2 = context.getBean("singleton", MyLearningService.class);
        service2.setProcessLearningName("name2");
        System.out.println(service2.getProcessLearningName());
        System.out.println(service1.getProcessLearningName());//here it will print "name 2"
        context.close();    
    }

    /**
     * prototype 
     */
    void prototype() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        MyLearningService service1 = context.getBean("prototype",MyLearningService.class);
        service1.setProcessLearningName("name1");
        System.out.println(service1.getProcessLearningName());

        MyLearningService service2 = context.getBean("prototype", MyLearningService.class);
        service2.setProcessLearningName("name2");
        System.out.println(service2.getProcessLearningName());
        System.out.println(service1.getProcessLearningName());//here it will print "name 1"
        context.close();
    }
}
