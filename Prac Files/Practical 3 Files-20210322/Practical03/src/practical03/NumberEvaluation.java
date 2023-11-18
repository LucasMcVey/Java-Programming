/*
 *  @author Carl
 *  File: NumberEvaluation.java
 *  Created on  10/02/2019,  3:25:05 PM
 */
package practical03;

import java.util.Scanner;

/**
 *
 * @author Carl
 */
public class NumberEvaluation {

    public static void main(String[] args) {
        int number = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        number = scan.nextInt();

        System.out.println(number);

        if (number < 0)
            System.out.println(number + " is Negative.");
            if (number > 0)
                System.out.println(number + " is Positive.");
            if (number == 0)
            System.out.println(number + " is Zero.");
            if (number % 2 == 0 )
            System.out.println("Number is even");
            else
            System.out.println("Number is odd");

    }

}
