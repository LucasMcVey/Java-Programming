public class ArithmeticExample {
    public static void main(String[] args) {
        int h = 9;
        int i = 2;
//        System.out.println(h / i);
//        System.out.println(h % 2);
//
//        double j = 2.0;
//        System.out.println(h / j);

//        double k = h / (double)i;
//        System.out.println(k);

        double a, b, c;
        a = 4;
        b = 8;
        c = a - b;
        System.out.println(c);
        c = a - b / a;
        System.out.println(c);
        c = (a - b) / a;
        System.out.println(c);
        c = a - b / a * b;
        System.out.println(c);
        c = a - b / (a * b);
        System.out.println(c);
    }
}
