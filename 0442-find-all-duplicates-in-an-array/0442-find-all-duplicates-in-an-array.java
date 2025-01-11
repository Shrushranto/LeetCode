class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // creating a list which will capture the duplicate element
        List<Integer> dupliFound = new ArrayList<>();
        
        // creating a hashSet so that it can help check all the elements
        // also using the contains() method as it has a efficient way to check that is O(1).
        HashSet<Integer> newArray = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(newArray.contains(nums[i])){
                dupliFound.add(nums[i]);
            }
            newArray.add(nums[i]);
        }
        return dupliFound;
    }
}