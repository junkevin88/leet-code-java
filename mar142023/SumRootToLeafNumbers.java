package mar142023;


class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        int currentSum = sum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return currentSum;
        }
        int leftSum = sumNumbers(node.left, currentSum);
        int rightSum = sumNumbers(node.right, currentSum);
        return leftSum + rightSum;
    }
}

