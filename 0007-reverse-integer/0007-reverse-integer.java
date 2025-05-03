class Solution {
    
    public int reverse(int x) {
        int num = x;
        boolean neg = false;
        if(num<0){
            neg = true;
            num=-num;
        } 

        long newNum = 0;
        while(num!=0){
            int remainder =  num%10;
            newNum = newNum *10 + remainder;
            num = num/10;
        }
        if(neg){
            newNum = -newNum;   
        }

        if(newNum > Integer.MAX_VALUE || newNum < Integer.MIN_VALUE){
            return 0;
        }
        return (int)newNum;
    }
}