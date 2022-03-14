package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human09DefaultConstructorAutowireAnnotationNoInjection {

//    THERE IS a constructor in Human class so THERE IS injection
    @Autowired
    public Human09DefaultConstructorAutowireAnnotationNoInjection(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    public Human09DefaultConstructorAutowireAnnotationNoInjection() {
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

