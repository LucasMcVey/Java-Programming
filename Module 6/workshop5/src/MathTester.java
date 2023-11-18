public class MathTester {
    public static void main(String[] args) {
        int n = 3;
        int p = 4;
        MathThingy mt = new MathThingy();
        System.out.println(n + " to the power " + p +
                " = " + mt.power(n,p));
        double a = -56.5;
        System.out.println("absolute value of " + a + " is " +
                mt.absolute(a));
    }
}
