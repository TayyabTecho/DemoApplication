package LAMBDA;

import java.util.function.Function;

public class q5 {
    public static void main(String[] args) {

        Function<Integer,String> f= x-> "Number: " + x;
        System.out.println(f.apply(5));


    }
}
