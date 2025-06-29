class Solution {
    public boolean checkInclusion(String s1, String s2) {
       HashMap<Character, Integer> freqMpp = new HashMap<>();
        for(char c : s1.toCharArray()){
            freqMpp.put(c, freqMpp.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> s2mpp = new HashMap<>();
        int maxLen = s1.length();
        for(int i = 0; i<s2.length(); i++){
            s2mpp.put(s2.charAt(i), s2mpp.getOrDefault(s2.charAt(i), 0)+ 1);
            if(i >= maxLen){
                char leftChar = s2.charAt(i - maxLen);
                if(s2mpp.get(leftChar) == 1){
                    s2mpp.remove(leftChar);
                }else{
                    s2mpp.put(leftChar, s2mpp.get(leftChar) - 1);
                }
            }

            if(freqMpp.equals(s2mpp)){
                return true;
            }
        }


        return false;
    }
}