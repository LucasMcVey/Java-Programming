package practical02;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;
        String message2;
        String total;
        String add = "0";

        System.out.println("Enter a line:");
        message = scan.nextLine();

        System.out.println("Enter another line:");
        message2 = scan.nextLine();

        total = message + message2;
        add = total;
        int k = Integer.parseInt(add)+ 1;

        System.out.println("Number = " + k);

    }  // method main
}  // class Number
