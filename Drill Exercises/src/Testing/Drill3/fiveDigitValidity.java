package Testing.Drill3;

import java.util.Scanner;

public class fiveDigitValidity {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 5-digit integer");
        num = scan.nextInt();
        int fifthDigit = num % 10;
        num = num / 10;
        int fourthDigit = num % 10;
        num = num / 10;
        int thirdDigit = num % 10;
        num = num / 10;
        int secondDigit = num % 10;
        num = num / 10;
        int firstDigit = num;
        if (firstDigit > fifthDigit)
            System.out.println("The number is true");
        else
            System.out.println("The number is false");
    }
}
