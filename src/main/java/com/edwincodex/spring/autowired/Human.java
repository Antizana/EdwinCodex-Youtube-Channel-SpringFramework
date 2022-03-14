package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    public Human(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    public Human() {
    }

    public void setHeart(Heart heart) {
        System.out.println("By Setter Method called with Heart Parameter");
        this.heart = heart;
    }

    public void startPumping(){
        if (heart != null){
            heart.pump();
            System.out.println("Animal name: " + heart.getNameOfAnimal()
                    + ", number of hearts present: " + heart.getNoOfHeart() );
        } else {
            System.out.println("You are NOT YET ALIVE :(");
        }
    }

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;
}

