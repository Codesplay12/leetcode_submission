class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create dummy node
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;

        // ListNode curr = dummy;

        // while (curr.next != null) {
        //     if (curr.next.val == val) {
        //         // remove node
        //         curr.next = curr.next.next;
        //     } else {
        //         // move forward
        //         curr = curr.next;
        //     }
        // }

        // return dummy.next;
         if (head == null) return null;

        // Process rest of list
        head.next = removeElements(head.next, val);

        // Decide for current node
        if (head.val == val) {
            return head.next; // skip current node
        } else {
            return head; // keep it
        }
    }
}
