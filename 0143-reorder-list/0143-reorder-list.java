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
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode middleList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode middleNode = middleList(head);
        ListNode newReverseList = reverseList(middleNode.next);
        middleNode.next = null;

        ListNode temp1 = head;
        ListNode temp2 = newReverseList;


        while(temp1!= null && temp2 != null){
            ListNode currHead = temp1;
            temp1 = temp1.next;
            currHead.next = temp2;
            currHead = temp2;
            temp2 = temp2.next;
            currHead.next = temp1;
        }
    }
}