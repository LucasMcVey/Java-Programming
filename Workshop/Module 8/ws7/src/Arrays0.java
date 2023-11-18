public class Arrays0 {
    public static void main(String[] args) {
        int[] a;
        a = new int[10];
        a[0] = 23;
        a[1] = -33;
        a[9] = 1;
//        System.out.println("a[2]=" + a[2]);
//        System.out.println("a[20]=" + a[20]);

        int b[] = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = b.length - i;
        }

//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }

        int[] c = {1, 5, -3, 7, 6};
        c[3] = 99;
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        String[] strArr = new String[12];
        System.out.println("strArr[4] = " + strArr[4]);

        double[] d = new double[12];
        d[1] = 3.4;
        int ff = 99;
        d[0] = ff;

        int[][] x = new int[3][4];
        x[0][0] = 5;
        x[2][3] = 4;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("x[" + i + "][" + j +"]=" +
                        x[i][j]);
            }
        }

        int[][][] zz = new int[3][2][4];
        int dim3 = zz[0][0].length;

//        Arrays1.findMin(a);
    }
}
