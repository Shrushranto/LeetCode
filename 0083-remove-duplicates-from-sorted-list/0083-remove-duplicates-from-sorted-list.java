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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode cur = temp.next;
        while(cur != null){
            if(temp.val == cur.val){
                temp.next = cur.next;
            }else{
                temp = cur;
            }
            cur = temp.next;
        }

        return head;
    }
}