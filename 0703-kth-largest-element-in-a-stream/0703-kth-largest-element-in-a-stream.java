class KthLargest {
    // min heap
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int K=0;
    public KthLargest(int k, int[] nums) {
        K = k;
        for(int i: nums){
            minHeap.add(i);
            if(minHeap.size() > K){
                minHeap.remove();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size()> K){
            minHeap.remove();
        }
        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */