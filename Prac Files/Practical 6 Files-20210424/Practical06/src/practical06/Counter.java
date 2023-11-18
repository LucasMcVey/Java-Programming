package practical06;

public class Counter {
// An instance variable to keep track of which number we are up to

    private int currentCount;
    // The constructor receives an int as a parameter and stores
// it in currentCount
    private int stepSize;

    public Counter(int startValue) {
        this.currentCount = startValue;
        this.stepSize = 1;
        System.out.println("Creating counter object with a starting value of " + this.currentCount);
    }

    public Counter(int startValue, int step) {
        this.currentCount = startValue;
        this.stepSize = step;
        System.out.println("Creating counter object with a starting value of " + this.currentCount + " and a step size of " + this.stepSize);
    }

    // A method to print out the next n numbers

    public void countUp(int n, char operation) {
        System.out.println("*** Counting up " + n + ", operation is " + operation);
        for (int step = 1; step <= n; step++) {
            if (currentCount <= 0) {
                break;
            }
            System.out.println("counter = " + currentCount);
            if (operation == '+') {
                currentCount = currentCount + stepSize;
            } else if (operation == '-') {
                currentCount = currentCount - stepSize;
            } else if (operation == '*') {
                currentCount = currentCount * stepSize;
            } else {
                System.out.println("Invalid operation: " + operation);
                break;
            }


        }  // end for loop
    } // end method countUp

    public void countDown(int n) {
        System.out.println("*** Counting down " + n);
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            currentCount = currentCount - 1;
        }  // end for loop
    }
} // end class Counter
