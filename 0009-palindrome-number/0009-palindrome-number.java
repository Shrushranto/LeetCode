class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int originalNum = x;
        int reversedNum = 0;

        while(originalNum >0){
            int lastdigit = originalNum % 10;
            reversedNum = reversedNum*10 + lastdigit;
            originalNum /= 10;
        }
        return (x == reversedNum);
    }
}