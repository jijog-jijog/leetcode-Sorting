public class missing2 {
    public static void main(String[] args) {
        int[] nums = { 9,6, 4,2,3  ,5,7,0,1};

        int i =0;
        while (i < nums.length) {
            int correct = nums[i];
             if (nums[i] < nums.length && nums[i] != nums[correct]) {
            int temp = nums[i];
            nums[i] = nums[correct];
             nums[correct] = temp; 
        }else{
            i++;
        }
        }
       

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != idx) {
                System.out.println(idx);
                return;
            }
        }
        System.out.println(nums.length);
    }
}