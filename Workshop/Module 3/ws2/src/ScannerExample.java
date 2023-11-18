import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String answer = sc.next();
        System.out.println("You said " + answer);

        System.out.println("What is your favourite number?");
        int num = sc.nextInt();
        System.out.println("You said " + num + " is your favourite number");
    }
}
