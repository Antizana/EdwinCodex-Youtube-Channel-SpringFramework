package com.edwincodex.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human14QualifierAnnotation {

    public Human14QualifierAnnotation(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
    }

    public Human14QualifierAnnotation() {
    }

    @Autowired
//    Specifies what heart object to use, in this case humanHeart.
    @Qualifier("humanHeart")
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

    private Heart heart;
}

//        By Setter Method called with Heart Parameter
//        Your heart is pumping
//        I'm Alive!
//        Animal name: Human, number of hearts present: 1
//
//        Process finished with exit code 0