class Solution {
    public int countDigits(int num) {
        int temp = num;
        List<Integer> myDigits = new ArrayList<Integer>();
        while(temp != 0){
            int n = temp%10;
            myDigits.add(n);
            temp = temp/10;
        }

        int count = 0;
        for(int i: myDigits){
            if(i!=0 && num % i == 0){
                count ++;
            }
        }

        return count;
    }

//     int temp = num;
//     int count = 0;

//     while(temp !=0){
//         int news = temp%10;
//         if(news!=0 && num%news == 0 ){
//             count++;
//         }
//         temp = temp/10;
//     }

//     return count;
// }
}