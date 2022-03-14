package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human12AutowireAnnotationByNameNoInjection {

    public Human12AutowireAnnotationByNameNoInjection(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    public Human12AutowireAnnotationByNameNoInjection() {
    }

    @Autowired
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

//  mar. 13, 2022 11:33:14 P. M. org.springframework.context.support.AbstractApplicationContext refresh
//  WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'human': Unsatisfied dependency expressed through method 'setHeart' parameter 0; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.edwincodex.spring.autowired.Heart' available: expected single matching bean but found 2: humanHeart,octopusHeart
//  Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'human': Unsatisfied dependency expressed through method 'setHeart' parameter 0; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.edwincodex.spring.autowired.Heart' available: expected single matching bean but found 2: humanHeart,octopusHeart
