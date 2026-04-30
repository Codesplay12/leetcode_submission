class Solution {
    public ListNode sortList(ListNode head) {
        // base case
        if(head == null || head.next == null)
            return head;

        // Step 1 - find middle
        ListNode mid = findMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null; // ✅ split into two halves

        // Step 2 - sort each half
        ListNode left  = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3 - merge sorted halves
        return merge(left, right);
    }

    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next; // ✅ head.next not head

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is at middle
    }

    ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr  = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        // attach remaining nodes
        if(l1 != null) curr.next = l1;
        if(l2 != null) curr.next = l2;

        return dummy.next;
    }
}


