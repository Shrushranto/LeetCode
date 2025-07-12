class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> maxElementStack = new Stack<>();
        HashMap<Integer, Integer> myhash = new HashMap<>();
        int n = nums2.length;
        int[] result = new int[nums1.length];

        for(int i = 0; i<n; i++){
            while(!maxElementStack.isEmpty() && nums2[i]>maxElementStack.peek()){
                int smaller = maxElementStack.pop();
                int greaterElement = nums2[i];
                myhash.put(smaller, greaterElement);
            }
            maxElementStack.push(nums2[i]);
        }

        while(!maxElementStack.isEmpty()){
            myhash.put(maxElementStack.pop(), -1);
        }


        for(int i=0; i<nums1.length; i++){
            result[i] = myhash.get(nums1[i]);
        }

        return result;
    }
}