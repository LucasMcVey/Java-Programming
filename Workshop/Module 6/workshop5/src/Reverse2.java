import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        int reverse = 0;
        // Printing the digits won't work for 1000
        // making a reverse number will
        do {
            // get the last digit in the number
            int lastDigit = number % 10;
            // print it
            System.out.print(lastDigit);
            // add it to the running total
//            reverse = (reverse * 10) + lastDigit;
            // throw it away
            number = number / 10;
            // go again
        } while (number > 0); // loop until nothing left

//        System.out.println(reverse);
    }
}
