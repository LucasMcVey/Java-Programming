import java.util.Scanner;

public class HowOldAmI {
    public static void main(String[] args) {
        System.out.print("How old are you (in years)? ");
        Scanner sc = new Scanner(System.in);

        int years = sc.nextInt();
        int ageInSeconds = years * 365 * 24 * 60 * 60;
        System.out.println("You've been alive for approximately " + ageInSeconds + " seconds.");
    }
}
