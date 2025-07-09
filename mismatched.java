
import java.util.Arrays;

public class mismatched {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
