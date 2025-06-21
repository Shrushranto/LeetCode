class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxOccur = 0;
        int maxLen = 0;

        int[] freq  = new int[26];
        
        while(right<s.length()){
            maxOccur = Math.max(maxOccur, ++freq[s.charAt(right) - 'A']);
            int len = right - left + 1;

            if(len - maxOccur > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}   