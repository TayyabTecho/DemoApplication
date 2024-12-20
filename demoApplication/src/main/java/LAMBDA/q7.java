package LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class q7 {

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();
        Consumer<List<String>> c=x-> {
                for(String s:list){
                    System.out.println(s);
                }};
        c.accept(list);
    }
}
