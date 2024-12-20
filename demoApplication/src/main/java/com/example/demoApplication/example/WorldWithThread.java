package com.example.demoApplication.example;

public class WorldWithThread implements Runnable{

//    @Override
//    public void start() {
//        super.start();
//    }

    @Override
    public void run(){
        for(; ;){
            System.out.println("world by" + Thread.currentThread().getName());
        }
    }
}
