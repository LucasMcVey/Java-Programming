import java.util.Scanner;
import java.util.Random;

public class GuessMyPassword {
    public static void main(String[] args) {
        String password = "landfill";
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess my secret password!");
        String userGuess = sc.next();

        if (userGuess.equals(password)) {
            System.out.println("You got it!");
        }
        else {

            System.out.println("Nope!");

//            int randomClue = new Random().nextInt(3);
            Random generator = new Random();
            int randomClue = generator.nextInt(3);

            switch(randomClue) {
                case 0:
                    System.out.println("The password is " + password.length() +
                        " characters long.");
                    break;
                case 1:
                    int pos = 3;
                    System.out.println("the character at position " + pos +
                            " is ..." + password.charAt(pos));
                    break;
                case 2:
                    String masked = password.replace('l', '*');
                    System.out.println("these are some of the charcters: " + masked);
                    break;
                case 3:
                    String direction;
                    if (password.compareTo(userGuess) < 0) {
                        direction = "earlier";
                    } else {
                        direction = "later";
                    }
                    System.out.println("The password occurs " + direction +
                            " in the alphabetical order than your guess.");
                    break;
            }
        }

    }
}
