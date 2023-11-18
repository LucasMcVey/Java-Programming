package practical03;

// CalculateBMI.java - calculate the BMI and then categorise
// it based on tablular values
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateBMI {

    public static void main(String[] args) {
        double weight, height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in kg: ");

        weight = sc.nextDouble();

        System.out.println("Input height in metres: ");

        height = sc.nextDouble();

        double BMI = weight / (height * height);

        DecimalFormat fmt = new DecimalFormat("0.#");

        if (BMI >= 18.5)
            if (BMI <= 24.9) {
                System.out.println("Your BMI is " + fmt.format(BMI) + " which means you are in the Normal Range");
            }
            else
            if (BMI <= 29.9) {
                System.out.println("Your BMI is " + fmt.format(BMI) + " which means you are in the Overweight Range");
            }
            else
            if (BMI > 30.0) {
                System.out.println("Your BMI is " + fmt.format(BMI) + " which means you are in the Obese Range");
            }
        else
            System.out.println("Your BMI is " + fmt.format(BMI) + " which means you are in the Underweight Range");

    }
}
