import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList a = new ArrayList();

        System.out.println("Type in anything. Type 'end' to end.");
        String input ="";
        while (!input.equals("end")) {
            input = sc.next();
            a.add(input);
        }
        System.out.println("\nYou said:");

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
