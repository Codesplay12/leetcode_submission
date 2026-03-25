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
    public void reorderList(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow);
        ListNode curr = head;
        while(rev.next != null){
            ListNode tempcurr = curr.next;
            curr.next = rev;
            ListNode temprev = rev.next;
            rev.next = tempcurr;

            curr = tempcurr;
            rev = temprev;

        }

    }
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead; 
    }
}
