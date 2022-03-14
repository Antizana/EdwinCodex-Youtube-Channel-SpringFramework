package com.edwincodex.spring.autowired;

public class HumanWithoutInjectionNullException {

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        heart.pump();
    }

    private Heart heart;
}

//    Exception in thread "main" java.lang.NullPointerException
//        at com.edwincodex.spring.autowired.Human.startPumping(Human.java:10)
//        at com.edwincodex.spring.autowired.Body.main(Body.java:14)
