package Testing.Drill8;

import java.util.Scanner;

public class nonNegativesProduct {
    public static void main(String[] args) {
        int negProduct = 1, nonNegProduct = 1, num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 7 integers");
        for(int i = 0; i < 7; ++i) {
            num = scan.nextInt();

            if (num < 0)
            {
               negProduct = negProduct * num;
            }

            if (num >= 0)
            {
                nonNegProduct = nonNegProduct * num;
            }
        }

        System.out.println("Product of non-negatives = " + nonNegProduct);
        System.out.println("Product of negatives = " + negProduct);
    }
}
