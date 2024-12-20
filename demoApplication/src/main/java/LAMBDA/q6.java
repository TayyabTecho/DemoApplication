package LAMBDA;
import java.util.function.Function;
public class q6 {
    public static void main(String[] args) {
        Function<Integer, String> f = (x) -> {
            if (x % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
            //System.out.println(f.apply(56));
        };
        System.out.println(f.apply(56));
}
}


//class{
//psvnm(){

//public String method(int x){
// if(x %2==0){
//                System.out.println(("even"));
// }
// else{
//                System.out.println(("odd"));
// }
// }
// method(x);
// }
//}
//