package may2023.may232023;

import java.util.PriorityQueue;

class KthLargestElementInAStream {
    private PriorityQueue<Integer> heap = new PriorityQueue<>();
    int k;

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        for (var n : nums) add(n);
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) heap.poll();
        return heap.peek();
    }
}
