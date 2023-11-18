public class Arrays2 {
    public static boolean[] findAllMin(int[] list) {
        boolean[] ret = new boolean[list.length];
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minValue) {
                minValue = list[i];
                ret[i] = true;
                for (int j = 0; j < i; j++) {
                    ret[j] = false;
                }
            }
            else if (list[i] == minValue) {
                ret[i] = true;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
//        int[] l1 = {-6, 3, 22, -69, 7, 88, 0, -6, -6};
        int[] l1 = {};

        boolean[] answers = findAllMin(l1);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i]) {
                System.out.println(i);
            }
        }
    }
}
