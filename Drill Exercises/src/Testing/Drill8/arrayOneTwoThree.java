package Testing.Drill8;
import java.util.ArrayList;
import java.util.List;


public class arrayOneTwoThree {
    public boolean arrayOneTwoThree(int[] nums) {

        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }
        return false;



    }
}
