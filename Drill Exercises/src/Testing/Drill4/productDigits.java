package Testing.Drill4;

import java.util.Scanner;

public class productDigits {
    public static void main(String[] args) {
        int num = 0;
        int multi = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 2-digit integer");
        num = scan.nextInt();
        int secondDigit = num % 10;
        num = num /10;
        int firstDigit = num;
        multi = firstDigit * secondDigit;
        System.out.println("The product of all of the digits is " + multi);
    }

}
