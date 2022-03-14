package com.edwincodex.spring.autowired;

public class Human {

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        if (heart != null){
            heart.pump();
        } else {
            System.out.println("Your are dead :(");
        }
    }

    private Heart heart;
}

