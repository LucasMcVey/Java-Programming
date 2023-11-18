package Testing.Drill5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class assScore {
    public static void main(String[] args) {

        int sum = 0, value, count = 0, cycle = 1;
        double average;
        Scanner scan = new Scanner(System.in);

        while (cycle <= 3)
        {
            System.out.println("Ass " + cycle + " score: ");
            value = scan.nextInt();
            count++;
            cycle++;
            sum += value;

        }

        average = (double) sum / count;

        DecimalFormat fmt = new DecimalFormat("0.##");
        System.out.println("Your average score is " + fmt.format(average));
    }
}
