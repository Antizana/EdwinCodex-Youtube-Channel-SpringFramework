package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

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

