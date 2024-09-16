import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter 'n' to quit:");
        System scan = new Scanner(System.in);

        String str = scan.next();
        while(!str.equals("n")){
            System.out.println("Your entered" + str);
            System.out.print("Enter 'n' to quit:");

            str= scan.next();

        }


    }
}
