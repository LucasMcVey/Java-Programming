package Testing.Drill2;

import java.util.Scanner;

public class outputMultiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nice;
        int number;
        int calculation;
        number = -96;
        System.out.println("Enter an integer:");
        nice = scan.nextInt();
        calculation = nice * number;
        System.out.println(nice + " * -96 = " + calculation);
    }
}
