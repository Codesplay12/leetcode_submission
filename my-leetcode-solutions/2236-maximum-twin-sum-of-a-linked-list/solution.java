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
    public int pairSum(ListNode head) {
         ListNode temp = head;
        int count = 0;
        int sum = 0;
        int MAX = 0;

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

             while(p2 !=  null){
                sum = p1.val + p2.val;
                MAX = Math.max(MAX,sum);
                p1 = p1.next;
                p2 = p2.next;

             }
             return MAX;
             
    }


    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead; 
    }
}
