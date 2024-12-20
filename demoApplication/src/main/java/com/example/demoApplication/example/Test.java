package com.example.demoApplication.example;

public class Test {
    public static void main(String[] args) {
//        WorldWithThread world=new WorldWithThread();
//        world.run();

        WorldWithThread withRunnable=new WorldWithThread();
   Thread t1=new Thread(withRunnable);
   t1.start();


        for(; ;){
            System.out.println("hello by"+ Thread.currentThread().getName());
        }
    }
}
