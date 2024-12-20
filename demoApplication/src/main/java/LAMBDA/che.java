package LAMBDA;
import java.util.ArrayList;
public class che {
    public void myMethod () {
        ArrayList<String> list = new ArrayList<>();
        list.add("tay");
        list.add("abc");
        list.add("def");
        list.add("geh");
        for (String s : list) {
            System.out.println(s.toUpperCase());
        }}
    public static void main(String[] args) {
        che obj=new che();
        obj.myMethod();
    }}