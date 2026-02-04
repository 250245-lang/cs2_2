import java.io.PrintStream;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.println("Enter number of seconds:");

        int input = in.nextInt();
        int seconds = input %60;
        int minutes = input /60 %60;
        int hours = input /(60*60);

        out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds);

        in.close();
    }
}