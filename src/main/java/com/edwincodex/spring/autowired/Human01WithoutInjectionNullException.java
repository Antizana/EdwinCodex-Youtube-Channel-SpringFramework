package com.edwincodex.spring.autowired;

public class Human01WithoutInjectionNullException {

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
//        heart isn't injected so, it's null and throws an exception calling pump from null

                heart.pump();
    }

    private Heart heart;
}

//    Exception in thread "main" java.lang.NullPointerException
//        at com.edwincodex.spring.autowired.Human.startPumping(Human.java:10)
//        at com.edwincodex.spring.autowired.Body.main(Body.java:14)

