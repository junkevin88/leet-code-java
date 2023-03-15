package mar152023;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfABinaryTree {

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean foundNull = false;
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                foundNull = true;
            } else {
                // If we have already found a null node and we encounter a non-null node
                // then the binary tree is not complete
                if (foundNull) {
                    return false;
                }
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        CheckCompletenessOfABinaryTree solution = new CheckCompletenessOfABinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        boolean isComplete = solution.isCompleteTree(root);
        System.out.println(isComplete); // Output: false
    }
}
