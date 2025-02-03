/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> newArr = new ArrayList<>();
        
        ListNode temp = head;
        while(temp!=null){
            newArr.add(temp.val);
            temp = temp.next;
        }
        int length = newArr.size();

        int[] result = new int[length];
        for(int i=0;i<length;i++){
            result[i] = 0;
            for(int j=i+1; j<length;j++){
                if(newArr.get(j) > newArr.get(i)){
                    result[i] = newArr.get(j);
                    break;
                }
            }
        }
        return result;

    }
}