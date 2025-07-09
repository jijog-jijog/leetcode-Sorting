

import java.util.Arrays;

public class firstmissing {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};

        int i =0;
        while (i < nums.length) {
            
            if (nums[i] > 0 && nums[i] <= nums.length  && nums[i] != nums[nums[i]-1] ) {
                int correct = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                System.out.println(j + 1); 
                return;
            }
        }
    
    }
}
