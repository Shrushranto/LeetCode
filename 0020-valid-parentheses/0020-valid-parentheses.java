class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

            if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
                        return false;
            } else if (s.length() == 1) {
                return false;
            }
            for (int i =0; i< s.length();i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    deque.push(s.charAt(i));
                }else if(deque.size() == 0) {
                    return false;
                }
                 else if (s.charAt(i) == ')') {
                    if (deque.getFirst() == '(') {
                        deque.pop();
                    } else {
                                               return false;

                    }
                }
                else if (s.charAt(i) == ']') {
                    if (deque.getFirst() == '[') {
                        deque.pop();
                    } else {
                                               return false;

                    }
                } else if (s.charAt(i) == '}') {
                    if (deque.getFirst() == '{') {
                        deque.pop();
                    } else {
                        return false;
                    }
                }
            }
                        if (deque.size() >0) {
                return false;
            }
            System.out.println(true);
            return true;
        }
}