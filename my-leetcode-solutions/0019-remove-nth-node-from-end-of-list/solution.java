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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      int count = 0;
      ListNode cur = head;


      if(n == 0) return head;

      while(cur != null){
        count++;
        cur = cur.next;
      }
      if(n == count) return head.next;
      ListNode fast = head;
      for(int i = 0;i<count - n-1;i++){
          fast = fast.next;
      }
      fast.next = fast.next.next;
   

      return head;
    }
}

