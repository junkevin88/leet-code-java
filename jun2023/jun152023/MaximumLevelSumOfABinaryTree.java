package jun2023.jun152023;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currSum = 0;
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                currSum += currNode.val;
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}
