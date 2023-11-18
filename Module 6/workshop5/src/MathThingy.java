public class MathThingy {

    // Return number to the power pow
    public int power(int number, int pow) {
        int total = 1;
        // loop pow times
        for (int counter = 1; counter <= pow ; counter++){
            // multiply running total by number
            total = total * number;
        }
        return total;
    }

    public double absolute (double n) {
//        if (n > 0) {
//            return n;
//        }
//        else {
//            return -n;
//        }
        return (n > 0) ? n : -n;
    }
}
