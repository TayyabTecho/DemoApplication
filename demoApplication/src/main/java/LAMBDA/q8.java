package LAMBDA;
import java.util.ArrayList;
import java.util.function.Consumer;
public class q8 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("tay");
        list.add("abc");
        list.add("def");
        list.add("geh");
        Consumer<String> c=x-> {
            for (String s : list) {
                System.out.println(s.toUpperCase());
            }
                    };
        c.accept("t");
    }
}
//public String myMethod(){
//    ArrayList<String> list=new ArrayList<>();
//    list.add("tay");
//    list.add("abc");
//    list.add("def");
//    list.add("geh");
//    for(String s: list ){
//        System.out.println(s.toUpperCase());
//    }
//}
