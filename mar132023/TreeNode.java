package mar132023;

public class TreeNode {
    int val;
    mar142023.TreeNode left;
    mar142023.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, mar142023.TreeNode left, mar142023.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
