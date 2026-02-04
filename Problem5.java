import java.io.PrintStream;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.println("Enter the year number:");

        int input = in.nextInt();

        if(input%4==0 && input%100!=0 || input%400==0){
            out.println("Leap year.");
        } else {
            out.println("Not a leap year.");
        }

        in.close();
    }
}