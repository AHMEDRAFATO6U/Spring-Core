package com.boot_demo1.lifecycledemoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;


// Main Application
//CommandLineRunner ->> INTERFACE THAT IMPLEMENT CODE AND LOAD ALL BEAN AND LOAD APPLICATION CONTEXT
@SpringBootApplication
public class LifecycleDemoApplication implements CommandLineRunner {

    // INJECTION BY CONSTRUCTOR
    private final MyBean myBean;

    public LifecycleDemoApplication(MyBean myBean) {
        this.myBean = myBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(LifecycleDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Application is running ===");
    }
}


// The Bean
@Component
class MyBean implements BeanNameAware, BeanFactoryAware {

    public MyBean() {
        System.out.println("[1] Bean Instantiated");
    }

    // BeanNameAware
    @Override
    public void setBeanName(String name) {
        System.out.println("[2] BeanNameAware: Bean name is " + name);
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("[3] BeanFactoryAware: BeanFactory injected");
    }

    // PostConstruct (Initialization)
    @PostConstruct
    public void init() {
        System.out.println("[4] @PostConstruct: Bean Initialized");
    }

    // PreDestroy (Cleanup)
    @PreDestroy
    public void destroy() {
        System.out.println("[7] @PreDestroy: Bean is being destroyed");
    }
}

// BeanPostProcessor ---> allows you to modify beans before and after initialization.  
@Component
class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("[BPP Before Init] Bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("[BPP After Init] Bean: " + beanName);
        return bean;
    }
}

