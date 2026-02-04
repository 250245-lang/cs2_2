import java.io.PrintStream;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        for (int i = 1; i <= 50; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                out.print("Fizz");
            } else if (i % 5 == 0) {
                out.print("Buzz");
            } else {
                out.print(i);
            }
            if(i!=50) out.print(", ");
        }

        in.close();
    }
}