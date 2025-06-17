class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int l = 0;
        int r =  len - 1;

        int maxArea = 0;

        while(l<r){
            int h = 0;
            int curArea =0;

            h = height[l] < height[r]? height[l] : height[r];

            curArea = h * (r-l);
            maxArea = Math.max(maxArea, curArea);

            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea; 
    }
}