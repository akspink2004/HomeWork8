package HomeWork_Week_8;
import java.util.Scanner;
public class MaxMin {

        public static void main(String[] args) {


            Scanner console = new Scanner(System.in);
            System.out.print("Type a number (or -1 to stop): ");
            int number = console.nextInt();
            int max = number;
            int min = number;

            while (number != 0) {
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
                System.out.print("Type a number (or 0 to stop): ");
                number = console.nextInt();
            }

            if (max != -1 && min != -1) {
                System.out.println("Maximum was " + max);
                System.out.println("Minimum was " + min);
            }
        }


}
