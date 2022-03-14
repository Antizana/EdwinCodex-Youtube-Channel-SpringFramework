package com.edwincodex.spring.autowired;

public class Human07WithConstructorAutowireInjection {

//    THERE IS a constructor in Human class so THERE IS injection
    public Human07WithConstructorAutowireInjection(Heart heart) {
        System.out.println("By CONSTRUCTOR called with Heart Parameter");
        this.heart = heart;
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

//    By CONSTRUCTOR called with Heart Parameter
//    Your heart is pumping
//    I'm Alive!
//
//    Process finished with exit code 0
