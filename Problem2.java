import java.io.PrintStream;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        double distance = 580;
        double fuel_needed = distance/100 * 8.5;
        double total = fuel_needed * 12500;

        out.printf("Distance: %,.2f%n km" +
                "Fuel Needed: %,.2f%n Liters" +
                "Total Cost: %,.2f%n UZS", distance, fuel_needed, total);

        in.close();
    }
}