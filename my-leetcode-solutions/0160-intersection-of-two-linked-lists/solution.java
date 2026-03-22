/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int c1 = 0;
        int c2 = 0;


         while(a != null){ c1++; a = a.next; }
          while(b != null){ c2++; b = b.next; }
        a = headA;
        b = headB;
         if(c1 > c2){
            int m = c1-c2;
            while(m > 0){ a = a.next; m--; }
        }
        else{
            int n = c2-c1;
            while(n > 0){ b = b.next; n--; }
        }
                 while(a != null && b != null){
            if(a == b) return a; 
            a = a.next;          
            b = b.next;
        }
        return null;

       
        }

    }

