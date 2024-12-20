package LAMBDA;

import java.util.function.Predicate;

public class q3 {
    public static void main(String[] args) {

        Predicate<String> p=x-> x.contains("a");
        System.out.println(p.test("arbaz"));

    }
}
