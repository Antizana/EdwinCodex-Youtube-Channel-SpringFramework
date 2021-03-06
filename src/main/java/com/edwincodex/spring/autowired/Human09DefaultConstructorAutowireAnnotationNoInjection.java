package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human09DefaultConstructorAutowireAnnotationNoInjection {

    @Autowired
    public Human09DefaultConstructorAutowireAnnotationNoInjection(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    //    THERE IS a default constructor in Human class BUT THERE ISN'T injection, because Autowired is OFF
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

//    You are NOT YET ALIVE :(
//
//        Process finished with exit code 0

