import java.util.Scanner;

public class ScannerWithStrings {
    public static void main(String[] args) {
        String s = "alpha beta gamma";
        Scanner sc = new Scanner(s);
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());

        String s2 = "dog -1.4 3.2";
        Scanner sc2 = new Scanner(s2);
        System.out.println(sc2.next());
        System.out.println(sc2.nextInt());
        System.out.println(sc2.nextDouble());

    }
}
