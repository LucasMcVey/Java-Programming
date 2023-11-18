public class Arrays1 {

    // unnecessary step, so can start at 1 in next version
    public static int findMin1(int[] list) {
        int minIndex = 0;
        int minValue = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minValue) {
                minIndex = i;
                minValue = list[i];
            }
        }
        return minIndex;
    }

    // but now crashes with empty list
    public static int findMin2(int[] list) {
        int minIndex = 0;
        int minValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minValue) {
                minIndex = i;
                minValue = list[i];
            }
        }
        return minIndex;
    }

    public static int findMin(int[] list) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minValue) {
                minIndex = i;
                minValue = list[i];
            }
        }
        return minIndex;
    }

    public static int findMin(int[] list, int start) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = start; i < list.length; i++) {
            if (list[i] < minValue) {
                minIndex = i;
                minValue = list[i];
            }
        }
        return minIndex;
    }

    public static void funny0(int[] a) {
        a[3] = 9;
    }

    public static void funny(int[] a) {
        a = new int[77];
        a[3] = 9;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = findMin(arr, i);
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        int[] l1 = {3, 22, -6, 7, 88, 0, -6};

        funny(l1);
        System.out.println(l1[1]);

//        System.out.println(findMin(l1));

//        sort(l1);

//        for (int x = 0; x < l1.length; x++) {
//            System.out.println(l1[x]);
//        }
    }
}
