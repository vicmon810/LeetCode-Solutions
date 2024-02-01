package dyn_prog;

public class BMP {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int maxValue;

    public static int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        helper(root);
        return maxValue;
    }

    static int helper(TreeNode node) {
        if (node == null)
            return 0;

        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        maxValue = Math.max(maxValue, left + right + node.val);

        return Math.max(left, right) + node.val;
    }

    public static void main(String[] args) {
        maxPathSum()
    }
}
