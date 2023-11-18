package Testing.Drill5;

import java.util.Scanner;

public class productLargestSmallest {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int product;
        int smallest;
        int largest;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter four integers");

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        smallest = num1;

        if (num2 <= smallest)
            smallest = num2;

        if (num3 <= smallest)
            smallest = num3;

        if (num4 <= smallest)
            smallest = num4;

        largest = num1;
        if (num2 >= largest)
            largest = num2;

        if (num3 >= largest)
            largest = num3;

        if (num4 >= largest)
            largest = num4;

        product = largest * smallest;


        System.out.println("The product of the smallest and largest numbers is: " + product);
    }
}
