import java.io.PrintStream;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Quantity of cappuccinos(price $4.50 each): ");
        int cappuccinos = in.nextInt();
        out.print("Quantity of muffins(price $3.00 each): ");
        int muffins = in.nextInt();
        double total = (cappuccinos*4.5 + muffins*3)*1.08 + 5;
        out.printf("Grand Total: %.2f%n", total);
        in.close();
    }
}