package BT;

import java.util.Stack;

public class SimilarLeaves {

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

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root1);
        s2.push(root2);
        while (!s1.empty() && !s2.empty())
            if (dfs(s1) != dfs(s2))
                return false;
        return s1.empty() && s2.empty();
    }

    public static int dfs(Stack<TreeNode> s) {
        while (true) {
            TreeNode node = s.pop();
            if (node.right != null)
                s.push(node.right);
            if (node.left != null)
                s.push(node.left);
            if (node.left == null && node.right == null) {
                System.out.println(node.val);
                return node.val;
            }
        }
    }

    public static void main(String[] args) {
        SimilarLeaves solution = new SimilarLeaves();

        // Create your tree nodes and roots
        SimilarLeaves.TreeNode root1 = solution.new TreeNode(1, solution.new TreeNode(3), solution.new TreeNode(2));
        SimilarLeaves.TreeNode root2 = solution.new TreeNode(1, solution.new TreeNode(3), solution.new TreeNode(2));

        leafSimilar(root1, root2);
    }
}
