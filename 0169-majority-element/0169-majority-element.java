class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i : nums){
            if(!mpp.containsKey(i)){
                mpp.put(i,1);
            }else{
                mpp.put(i, mpp.get(i) + 1);
            }
        }

        int Digit = 0;
        int maxFreq = -1;
        for(int j : mpp.keySet()){
            if(mpp.get(j)> maxFreq){
                Digit = j;
                maxFreq = mpp.get(j);
            }
        }


        return Digit;
        
        
    }
}