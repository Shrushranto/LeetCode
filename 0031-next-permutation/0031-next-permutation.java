class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        for(int i= n-2; i>=0; i--){
            if(nums[i]< nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            int left = 0;
            int right = nums.length -1;
            while(left<right){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }
            return;
        }
        for(int i = n-1; i>=0; i--){
            if(nums[i]> nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        

        int left = index+1;
        int right = nums.length -1;
        while(left<right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
}