package c0909_method_calls;

import java.util.List;

public class TrickyPrimitives {
    public static void main(String[] args) {
        //unmodify 
        List<Integer>ints = List.of(0,1,2,3);

        for(Integer i : ints){
            System.out.println(i * i);
        }

        // System.out.println('a' + 1);

        // int b = 'a';
        // System.out.println(b);

        char c = 'a' +1;
        System.out.println(c);

        // char b2 = b;
        // System.out.println(b2);
    }
}
