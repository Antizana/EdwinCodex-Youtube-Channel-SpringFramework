package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human16AutowiredOnDependecy {

    public Human16AutowiredOnDependecy(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    public Human16AutowiredOnDependecy() {
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

//    Also runs with the dependency
    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;
}

//    Your heart is pumping
//    I'm Alive!
//    Animal name: Human, number of hearts present: 1
//
//    Process finished with exit code 0