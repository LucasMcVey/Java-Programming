public class ForExample {
    public static void main(String[] args) {

        for (int countdown = 10; countdown > 0; countdown--) {
            System.out.println(countdown + "...");
        }

        // The following is equivalent, but kind of cryptic
        for (int countdown = 10; countdown > 0;
             System.out.println(countdown + "..."), countdown--);
    }
}
