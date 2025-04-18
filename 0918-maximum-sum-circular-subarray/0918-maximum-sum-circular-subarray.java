class Solution {
    private int kadanes(int[] a){
        int n = a.length;
        int sum= a[0], answer= a[0];

        for(int i =1; i<n; i++){
            sum += a[i];
            if(sum<a[i]) sum = a[i];
            answer = Math.max(sum,answer);  
        }
        return answer;
    }
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 0) return 0;
        int x = kadanes(nums);
        int y =0;
        for(int i=0; i<nums.length; i++){
            y += nums[i];
            nums[i] *= -1;
        }

        int z = kadanes(nums);
        if(y + z == 0) return x;
        return Math.max(x, y+z);
    }
}