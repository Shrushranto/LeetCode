class Solution {
    public int calPoints(String[] operations) {
        int length = operations.length;
        int[] records = new int[length];

        int j = 0;
        for(int i=0; i<length; i++){
            switch(operations[i]){
                case "+":
                    records[j] = records[j-1] + records[j-2];
                    j++;
                    break;
                
                case "C":
                    records[--j] = 0;
                    break;

                case "D":
                    records[j] = records[j-1]*2;
                    j++;
                    break;
                default :
                    records[j] = Integer.parseInt(operations[i]);
                    j++;
                    break;
            }
        }

        int totalSum = 0;
        for(int i: records){
            totalSum += i;
        }

        return totalSum;
    }
}