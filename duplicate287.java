
import java.util.Arrays;

public class duplicate287 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};

        int i =0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                System.out.println(nums[j]);
                break;
            }
            
        }
    System.out.println(Arrays.toString(nums));
    }
}
