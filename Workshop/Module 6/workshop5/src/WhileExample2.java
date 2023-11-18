public class WhileExample2 {
    public static void main(String[] args) {
        int countdown = 21;

        while (countdown != 0) { // won't work with odd numbers!
//        while (countdown > 0) { // this is better
            System.out.println(countdown + "...");
            countdown -= 2;
        }

    }
}
