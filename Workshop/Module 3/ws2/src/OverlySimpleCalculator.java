import java.util.Scanner;

public class OverlySimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double d2 = sc.nextDouble();

        double answer = d1 + d2;
        System.out.print(d1 + " + " + d2 + " = " + answer);

    }
}
