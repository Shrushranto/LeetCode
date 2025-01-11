class Solution {
    public boolean containsDuplicate(int[] nums) {

        // using 2 pointer approach
        // this is a brute force method with a time complexity of 0(n2)
    //     for(int i=0; i<nums.length; i++){
    //         for(int j= i+1; j<nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
                    
    //             }
    //         }
    //     }
    //     return false;
    // }


    // another way is we can sort the array and check if the first element is equal to second element

    // this has a time complexity of O(log n)
        //  Arrays.sort(nums);

        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;






        // another way to do this is using ArrayList

        // ArrayList<Integer> numbers = new ArrayList();

        // for(int i=0; i<nums.length; i++){
        //     //  here the method contains() has a time complexity of o(n) which is not efficient
        //     if(numbers.contains(nums[i])){
        //         return true;
        //     }
        //     numbers.add(nums[i]);
        // }
        // return false;



        // the method contains() has  a time complexity of O(1) in HashSet so it is good to use HashSet
        HashSet<Integer> numbers = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }    
       
}
