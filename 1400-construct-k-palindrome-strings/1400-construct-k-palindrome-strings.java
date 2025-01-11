class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        if (n<k) return false;
        if (n == k) return true;

        // finding frequency
        int[] freqCount = new int[26];
        for(int i=0; i<n; i++){
            freqCount[s.charAt(i) - 'a']++;
        }

        // finding the odd count
        int c = 0;
        for(int j=0; j<26; j++){
            if(freqCount[j]%2 != 0) c++;
        }

        return c<=k;
    }
}