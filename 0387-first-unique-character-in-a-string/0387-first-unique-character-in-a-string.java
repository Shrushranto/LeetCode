class Solution {
    public int firstUniqChar(String s) {

        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
        // HashMap<Character, Integer> freqMap = new HashMap<>();
        // for(int i=0; i<s.length();i++){
        //     freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0)+ 1);
        //     int curFreq = freqMap.get(s.charAt(i));
        //     if(curFreq == 1){
        //         return i;
        //     }
        // }
        // return -1;

        // int i=0;
        // while(i<s.length()){
        //     if(freqMap.get(s.charAt(i)) == 1){
        //         return i;
        //     }
        //     i++;
        // }
        // return -1;
    }
}