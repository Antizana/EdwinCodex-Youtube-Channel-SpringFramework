package com.edwincodex.spring.autowired;

public class Human {

    public void setHeart(Heart heart) {
        System.out.println("By Setter Method call with Heart Parameter");
        this.heart = heart;
    }

    public void startPumping(){
        if (heart != null){
            heart.pump();
        } else {
            System.out.println("Your are NOT YET ALIVE :(");
        }
    }

    private Heart heart;
}

