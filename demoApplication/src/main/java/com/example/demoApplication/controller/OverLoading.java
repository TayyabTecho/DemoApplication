package com.example.demoApplication.controller;

public class OverLoading
{
//    public void m1(float f){
//        System.out.println("int method");
//    }
    public void m1(String string){
        System.out.println("string method");
    }
//    public void m1(Integer f){
//        System.out.println("integer method");
//    }
//    public void m1(float i){
//        System.out.println("integer method");
//    }
    public void m1(Object object){
        System.out.println("object method");
    }


    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        o.m1(null);
    }
//    priority when null argument provided
    //String
    //Wrapper
    //Object
}
