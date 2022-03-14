package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human08NoDefaultConstructorAutowireAnnotationNoInjection {

//    There ISN'T a default constructor in Human class so THERE ISN'T injection
    @Autowired
    public Human08NoDefaultConstructorAutowireAnnotationNoInjection(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    public void setHeart(Heart heart) {
        System.out.println("By Setter Method called with Heart Parameter");
        this.heart = heart;
    }

    public void startPumping(){
        if (heart != null){
            heart.pump();
        } else {
            System.out.println("You are NOT YET ALIVE :(");
        }
    }

    private Heart heart;
}

//mar. 13, 2022 10:53:03 P. M. org.springframework.context.support.AbstractApplicationContext refresh
//        WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'human' defined in class path resource [beans.xml]: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.edwincodex.spring.autowired.Human]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.edwincodex.spring.autowired.Human.<init>()
//        Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'human' defined in class path resource [beans.xml]: Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.edwincodex.spring.autowired.Human]: No default constructor found; nested exception is java.lang.NoSuchMethodException: com.edwincodex.spring.autowired.Human.<init>()

