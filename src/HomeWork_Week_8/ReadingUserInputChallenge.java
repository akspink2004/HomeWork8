package HomeWork_Week_8;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a<=10){
            System.out.println("Enter number # " + a + ":");
            if (sc.hasNextInt()){
                sum = sum + sc.nextInt();
            }else {
                System.out.println("Invalid Number");
            }
            a++;
        }
        System.out.println("Sum of Enter 10 number :" + sum);
    }
}

