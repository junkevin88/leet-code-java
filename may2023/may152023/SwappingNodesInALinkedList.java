package may2023.may152023;

public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;

        for(int i=0; i<k; i++) {
            fast = fast.next;
        }

        ListNode first = fast;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode second = slow;

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return dummy.next;

    }
}
