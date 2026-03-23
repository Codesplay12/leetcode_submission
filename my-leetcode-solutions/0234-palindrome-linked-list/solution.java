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
    public boolean isPalindrome(ListNode head) {
          if(head == null) return true;
        ListNode temp = head;
        int count = 0;
        ListNode slow = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
          if(count % 2 == 0){
            for(int i = 0;i<count/2-1;i++){
                slow = slow.next;
            }
         }
        else{
            for(int i = 0;i<count/2;i++){
                slow = slow.next;
            }
        }
            ListNode p2 = reverse(slow.next);
            ListNode p1 = head;
             ListNode temp2 = p2; // save to restore later
            boolean result = true;
           

            while(p2 != null){
                if(p1.val != p2.val){
                   result = false;
                   break;
                }
                 p1 = p1.next;
                p2 = p2.next;
              
            }
            return result;
        
    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead; 
    }
}
