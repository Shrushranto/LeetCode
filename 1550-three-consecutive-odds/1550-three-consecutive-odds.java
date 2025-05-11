class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int countOdds = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] %2 != 0){
                countOdds++;
            }else{
                countOdds= 0;
            }
            if(countOdds ==3) return true;
        }
        return false;
    }
}