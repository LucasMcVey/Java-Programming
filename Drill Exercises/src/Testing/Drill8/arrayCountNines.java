package Testing.Drill8;

public class arrayCountNines {
    public int arrayCountNines(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num == 9) {
                result++;
            }
        }
        return result;
    }
}
