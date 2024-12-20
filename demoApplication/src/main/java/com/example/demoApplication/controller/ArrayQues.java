package com.example.demoApplication.controller;
import java.util.ArrayList;
import java.util.List;
public class ArrayQues {
    public static void main(String[] args) {
List<String> arr =new ArrayList<>();
arr.add("A");
arr.add("A");
arr.add("B");
arr.add("B");
arr.add("C");
arr.add("C");
arr.add("A");
arr.add("B");
//A ==3
//B ==3
//B ==2
int a=0,b=0,c=0;
for (String i:arr){
    if(i=="A")
        a++;
    if(i=="B")
        b++;
    if(i=="C")
        c++;
    }
    System.out.println(" a ="+a +"\n b = "+b+"\n c= "+c );
    }
}
