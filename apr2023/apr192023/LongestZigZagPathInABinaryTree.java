package apr2023.apr192023;

public class LongestZigZagPathInABinaryTree {
    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[] {0, 0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int[] res = new int[2];
        res[0] = Math.max(left[1], right[1]) + 1;
        res[1] = Math.max(left[0], right[0]) + 1;
        return res;
    }
    public int longestZigZag(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);

    }
}
