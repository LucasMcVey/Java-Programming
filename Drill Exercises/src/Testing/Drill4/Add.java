package Testing.Drill4;


import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        final int MAX = 18;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers:");
        num = scan.nextInt();
        num2 = scan.nextInt();
        if (num < num2)
            System.out.println(num2 + " + " + MAX + " = " + (num2 + MAX));
        else
            System.out.println(num + " - " + MAX + " = " + (num - MAX));

    }
}
