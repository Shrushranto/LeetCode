class Solution {

    public static int parentIdx(int idx){
        return (idx-1)/ 2;
    }
    
    public static void sinkdown(List<Integer> heap, int idx){
        int size = heap.size();
        int minIdx = idx;
        while(true){
            int leftChild = 2 * idx+1;
            int rightChild = 2 * idx+2;
            
            if(leftChild<size && heap.get(leftChild) < heap.get(minIdx)){
                minIdx = leftChild;
            }
            if(rightChild<size && heap.get(rightChild) < heap.get(minIdx)){
                minIdx = rightChild;
            }
            if(idx != minIdx){
                int temp = heap.get(idx);
                heap.set(idx, heap.get(minIdx));
                heap.set(minIdx, temp);
                
                idx = minIdx;
            }else{
                break;
            }
            
        }
    }
    public int findKthLargest(int[] nums, int k) {
         List<Integer> minHeap = new ArrayList<>();
        
        for(int i: nums){
            if(minHeap.size()<k){
                minHeap.add(i);
                int current = minHeap.size() - 1;
                while(current > 0){
                    if(minHeap.get(current)<minHeap.get(parentIdx(current))){
                        int temp = minHeap.get(current);
                        minHeap.set(current, minHeap.get(parentIdx(current)));
                        minHeap.set(parentIdx(current), temp);
                    
                        current = parentIdx(current);
                    }else{
                        break;
                    }
                }
            }else if(i>minHeap.get(0)){
                minHeap.set(0, i);
                sinkdown(minHeap, 0);
            }
            
        }
        
        int KthLargestElement = minHeap.remove(0);
        return KthLargestElement;
        
    }
}