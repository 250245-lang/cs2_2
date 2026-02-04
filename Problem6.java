import java.io.PrintStream;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.println("Enter the package weight in kg:");

        double input = in.nextDouble();
        double price;

        if(input<=2){
            price = 5;
        } else if (input <= 10) {
            price = 10;
        } else {
            price = 10 + 2*(input-10);
        }
        out.printf("Shipping Cost: $%.2f", price);

        in.close();
    }
}