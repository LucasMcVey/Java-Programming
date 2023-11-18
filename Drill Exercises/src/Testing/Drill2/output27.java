package Testing.Drill2;

import java.util.Scanner;

public class output27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nice;
        int number;
        int calculation;
        number = -27;
        System.out.println("Enter an integer:");
        nice = scan.nextInt();
        calculation = nice + number;
        System.out.println(nice + " + -27 = " + calculation);
    }
}
