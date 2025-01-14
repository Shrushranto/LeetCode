class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] freq = new int[n+1];
        int count = 0;
        int [] updatedArray = new int[n];

        for(int i=0; i<n; i++){
            freq[A[i]]++;
            if(freq[A[i]] == 2) count++;

            freq[B[i]]++;
            if(freq[B[i]] == 2) count++;

            updatedArray[i] = count;
        } 
        return updatedArray;
    }
}