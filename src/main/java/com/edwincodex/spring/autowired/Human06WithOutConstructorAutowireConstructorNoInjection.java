package com.edwincodex.spring.autowired;

public class Human06WithOutConstructorAutowireConstructorNoInjection {

//  There ISN'T a constructor in Human class so there ISN'T injection with Autowire = "constructor"

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

//  You are NOT YET ALIVE :(-->
//
//  Process finished with exit code 0-->