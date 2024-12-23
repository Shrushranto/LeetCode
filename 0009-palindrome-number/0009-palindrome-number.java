class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reversedNum = 0;
        
        while(originalNum >0){
            int lastdigit = originalNum % 10;
            reversedNum = reversedNum*10 + lastdigit;
            originalNum /= 10;
        }
        if(x == reversedNum){
            return true;
        }else
            return false;
    }
}