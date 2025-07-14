class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> charSeq = new HashMap<>();
        charSeq.put(']','[');
        charSeq.put(')','(');
        charSeq.put('}','{');

        Stack<Character> SequenceOfChar = new Stack<>();

        if(s.length() == 1){
            return false;
        }

        for(char i=0; i<s.length(); i++){
            if(s.charAt(i)== '(' ||s.charAt(i)== '{' || s.charAt(i)== '['){
                SequenceOfChar.push(s.charAt(i));
            }else{
                if(SequenceOfChar.isEmpty()){
                    return false;
                }
                if(SequenceOfChar.peek() != charSeq.get(s.charAt(i))){
                    return false;
                }

                SequenceOfChar.pop();
            }
        }
        return SequenceOfChar.isEmpty();
    }
}