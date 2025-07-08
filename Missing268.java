
import java.util.Arrays;



public class Missing268 {
    public static void main(String[] args) {
        int[] nums = {9,6};

        int i = 0;
        while(i < nums.length){
            int correct = nums[i]; 

            if (nums[i] != nums[correct]) { 
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            }else{
                i++;
            }
        }
    // for(int a : nums){
            System.out.println(Arrays.toString(nums));
    // }

    }
}
