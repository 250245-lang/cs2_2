import java.io.PrintStream;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        int population = 100000;
        int target = population * 2;
        int years = 0;

        while (population < target){
            population *= 1.05;
            years++;
            out.printf("Year %d: %d%n", years, population);
        }

        out.printf("It will take %d years to double.", years);
        in.close();
    }
}