class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> myhash = new HashMap<>();
        int maxlength = 0;
        int l = 0;
        // int r = 0;
        for(int r=0;r<s.length(); r++){
            if(!myhash.containsKey(s.charAt(r))){
                myhash.put(s.charAt(r), r);
                maxlength = Math.max(maxlength, r-l+1);
            }else{
                l= Math.max(myhash.get(s.charAt(r))+1, l);
                myhash.put(s.charAt(r), r);
                maxlength = Math.max(maxlength, r-l+1);
            }
        }
        return maxlength;
    }
}