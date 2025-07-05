class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        for(char i: t.toCharArray()){
            need.put(i, need.getOrDefault(i, 0)+1);
        }

        int l=0;
        int r=0;
        int minLength = Integer.MAX_VALUE;
        int matched = 0;
        int startIdx = -1;

        HashMap<Character, Integer> window = new HashMap<>();
        while(r<s.length()){
            char currentChar = s.charAt(r);
            window.put(currentChar, window.getOrDefault(currentChar, 0)+1);

            if(need.containsKey(currentChar) && window.get(currentChar).intValue() == need.get(currentChar).intValue()){
                matched ++;
            }

            while(matched == need.size()){
                int curLength = r-l+1;

                if(curLength < minLength){
                    minLength = curLength;
                    startIdx = l;
                }

                char leftLetter = s.charAt(l);
                window.put(leftLetter, window.get(leftLetter)- 1);

                if(need.containsKey(leftLetter) && window.get(leftLetter).intValue() < need.get(leftLetter).intValue()){
                    matched--;
                }

                l++;
            }

            r++;
        }

        if(startIdx == -1) return "";

        StringBuilder sb = new StringBuilder();
        for(int i= startIdx; i<startIdx + minLength; i++){
            sb.append(s.charAt(i));
        }

        String ValidSubString = sb.toString();

        return ValidSubString;
    }
}