package LAMBDA;

import java.util.function.Predicate;

public class q2 {
    public static void main(String[] args) {

        Predicate<String> p=x->x.length()>5;
        System.out.println(p.test("Toseef"));

    }
}
