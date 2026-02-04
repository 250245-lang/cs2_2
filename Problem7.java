import java.io.PrintStream;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;


        int CORRECT_PIN = 4587;
        int attempts_remaining = 3;
        int input;

        while(attempts_remaining>0){
            out.print("Enter PIN: ");
            input = in.nextInt();
            if(input == CORRECT_PIN){
                out.println("Access Granted.");
                break;
            } else {
                out.println("Try again.");
                attempts_remaining--;
            }
        }

        if(attempts_remaining==0){
            out.println("Account Locked");
        }

        in.close();
    }
}