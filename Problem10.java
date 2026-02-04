import java.io.PrintStream;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter the number of years you want your deposit to be: ");
        int years = in.nextInt();
        double amount = 1000;

        for (int i = 1; i <= years; i++) {
            amount *= 1.05;
            out.printf("Year %d: $%.2f%n", i, amount);
        }

        in.close();
    }
}