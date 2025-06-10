class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) return nums;

        Map<Integer, Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

// we will create a maxHeap using Priority Queue so top of the Queue will the highest value

        Queue<Integer> MaxPq = new PriorityQueue<>((a,b)->mp.get(b) - mp.get(a));
        MaxPq.addAll(mp.keySet());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]= MaxPq.poll();
        }

        return result;
    }
}