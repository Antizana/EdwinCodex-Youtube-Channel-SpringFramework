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

//    By Setter Method called with Heart Parameter
//    Your heart is pumping
//    I'm Alive!
//
//        Process finished with exit code 0