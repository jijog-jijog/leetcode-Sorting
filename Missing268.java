
import java.util.Arrays;

public class Missing268 {
    public static void main(String[] args) {
        int[] nums = {1,5,4,0,7,6,3,8};

        int i = 0;
        while(i < nums.length){
            int correct = nums[i]; 
            
            if (nums[i] < nums.length && nums[i] != nums[correct]) { 
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            }else{
                i++;
            }
        }
        //  if (nums[i] != i) {
        //               System.out.println(nums[i]);
        //  }
      System.out.println(Arrays.toString(nums));
      for(int j =0; j<nums.length; j++){

        if (nums[j] != j) {
            System.out.println(j);
            break;
        }
      }
    
    }
}
    

