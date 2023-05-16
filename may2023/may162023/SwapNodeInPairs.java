package may2023.may162023;

public class SwapNodeInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy, curr = head;

        while(curr != null && curr.next != null) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;

            prev = curr;
            curr = curr.next;
        }

        return dummy.next;

    }
}
