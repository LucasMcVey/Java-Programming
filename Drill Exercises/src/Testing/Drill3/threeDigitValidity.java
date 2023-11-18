package Testing.Drill3;

import java.util.Scanner;

public class threeDigitValidity {
    public static void main(String[] args) {
        int num = 0;
        int add = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3-digit integer");
        num = scan.nextInt();
        int minus = num;
        int thirdDigit = num % 10;
        num = num /10;
        int secondDigit = num % 10;
        num = num /10;
        int firstDigit = num;
        add = firstDigit + secondDigit;
        if (minus > add)
            System.out.println("The number is true");
        else
            System.out.println("The number is false");
    }
}
