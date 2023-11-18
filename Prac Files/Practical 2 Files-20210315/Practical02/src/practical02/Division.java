package practical02;


import java.util.Scanner;
/**
 *
 * @author
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        float d = 100;
        int di = 100;
        int reverse = 0;

        System.out.print("Enter an Integer: ");
        input = scan.nextInt();

        float first = input / d;
        int second = input % di;
        int third = input / di;


        while (input !=0) {
            reverse = reverse * 10;
            reverse = reverse + input % 10;
            input = input/10;
        }

        int fourth = reverse;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

}
