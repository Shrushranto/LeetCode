class Solution {
    private int findDigitSum(int num){
        int sum = 0;
        while(num!= 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
    HashMap<Integer,Integer> groups = new HashMap<>();
    int maxSize = 0;
    int count = 0;
    public int countLargestGroup(int n) {
        // for(int i=1; i<= n; i++){
        //     int digitSum = findDigitSum(i);
        //     int newCount = 0;
        //     if(!groups.containsKey(digitSum)){
        //         groups.put(digitSum, 1);
        //         newCount = groups.get(digitSum);
        //         if(newCount > maxSize){
        //             maxSize = newCount;
        //             count =1;
        //         }else if(newCount == maxSize){
        //             count++;
        //         }
        //     }else{
        //         groups.put(digitSum, groups.get(digitSum)+1);
        //         newCount = groups.get(digitSum);
        //         if(newCount > maxSize){
        //             maxSize = newCount;
        //             count =1;
        //         }else if(newCount == maxSize){
        //             count++;
        //         } 
        //     }
        // }
        // return count;

        for(int i=1; i<=n; i++){
            int digitSum = findDigitSum(i);
            int newCount = groups.getOrDefault(digitSum, 0)+1;
            groups.put(digitSum,newCount);

            if(newCount>maxSize){
                maxSize = newCount;
                count = 1;
            }else if(newCount == maxSize){
                count++;
            }
        }
        return count;
    }
}