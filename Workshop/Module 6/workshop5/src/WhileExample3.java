import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in anything. Type 'end' to end.");
        String input = sc.next();
        while (!input.equals("end")) {
            System.out.println("And the next thing:");
            input = sc.next();
        }
        System.out.println("Thanks!");
    }
}
