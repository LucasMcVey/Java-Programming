package Testing.Drill3;

import java.util.Scanner;

public class outputSum {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        System.out.println("Enter a 6-digit integer ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of all of the digits is " + sum);
    }
}
