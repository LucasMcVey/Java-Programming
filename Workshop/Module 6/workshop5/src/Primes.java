public class Primes {
    public static void main(String[] args) {
        for (int candidate = 3; candidate < 100; candidate += 2) {
            boolean isPrime = true;
            for (int factor = 3; factor < candidate; factor +=2) {
                if (candidate % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

//            int factor = 3;
//            while ( factor < candidate) {
//                if (candidate % factor == 0) {
//                    isPrime = false;
//                    break;
//                }
//                factor +=2;
//            }
            if (isPrime) {
                System.out.println(candidate + " is prime.");
            }
        }

    }
}
