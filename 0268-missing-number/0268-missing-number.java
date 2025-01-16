class Solution {
    int temp = 0, num = 0;
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*n+n)/2;
        int sumOfnums = 0;
        for(int i = 0;i<nums.length;i++){
            sumOfnums += nums[i];
        }
        return sum-sumOfnums;

    }
}