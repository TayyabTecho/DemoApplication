package LAMBDA;

import java.util.ArrayList;
import java.util.function.Consumer;
public class q9 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
list.add("Tayyab");
        list.add("TalhaManyar");list.add("Toed");list.add("tab");list.add("Tos");
        //Consumer<String> c=x-> {
         for(String s:list){
            int i= s.length();
         }
            Consumer<String> c=x-> {
        if (i<4){
            System.out.println(s);
        }
        };
    }
}
