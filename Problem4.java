import java.io.PrintStream;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.println("Enter your age:");

        int input = in.nextInt();
        int price = 0;

        if(input<13){
            price = 7;
        } else if (input < 18) {
            price = 10;
        } else if (input < 65) {
            price = 15;
        } else {
            price = 10;
        }

        out.printf("Ticket Price: $%d", price);

        in.close();
    }
}