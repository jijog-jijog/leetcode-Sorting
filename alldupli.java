
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class alldupli {
    public static void main(String[] args) {
        int[] nums = {1};
        List<Integer> arr = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] =temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                arr.add(nums[j]);
            }
            
        }
        System.out.println(arr.toString());
    }
}
