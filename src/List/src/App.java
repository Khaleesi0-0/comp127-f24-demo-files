import java.util.List;

public class App {
 public static void main(String[] args) {
        //unmodify 
        List<Integer>ints = List.of(0,1,2,3);

        for(Integer i : ints){
            System.out.println(i * i);
        }
        ints= new ArrayList<Integer>[];
        ints.add(1);
        System.out.println(ints);
    
    }
        
}
