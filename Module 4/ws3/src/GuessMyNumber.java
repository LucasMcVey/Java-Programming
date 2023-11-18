import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        final int TOP = 10;
        Random generator = new Random();
        int mySecretNumber = generator.nextInt(TOP);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess my secret number between 0 and " + TOP + ".");
        int userGuess = sc.nextInt();

        if (userGuess == mySecretNumber) {
            System.out.println("you got it!");
        }
        else {
            System.out.println("Sorry not quite right");
            if (userGuess < mySecretNumber) {
                System.out.println("my secret number is higher than that.");
            }
            else {
                System.out.println("my secret number is lower than that.");
            }
            System.out.println("It was actually " + mySecretNumber);
        }



    }

}
