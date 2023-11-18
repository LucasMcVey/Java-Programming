import java.util.Scanner;

public class ValidityExample {
    public static void main(String[] args) {
        System.out.println("Please enter a whole number greater than 0.");
        System.out.println("It must have 4 digits.");
        System.out.println("the first digit must be smaller than the last one.");
        System.out.println("The number must be a multiple of 3.");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean valid = true;
        if ((number < 1000) || (number > 9999)) {
            valid = false;
        }
        else {
            int firstDigit = number / 1000;
            int lastDigit = number % 10;
            System.out.println("firstDigit = " + firstDigit);
            System.out.println("lastDigit = " + lastDigit);

            if (firstDigit >= lastDigit) {
                valid = false;
            }
            else {
                if (number % 3 != 0) {
                    valid = false;
                }
            }
        }
        if (valid) {
            System.out.println("well done");
        }
        else {
            System.out.println("Sorry that number is not valid.");
        }
    }
}
