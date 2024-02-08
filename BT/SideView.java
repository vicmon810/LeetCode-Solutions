package BT;

import java.util.ArrayList;
import java.util.List;

public class SideView {

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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null)
            return;

        if (currDepth == result.size())
            result.add(curr.val);

        rightView(curr.left, result, currDepth + 1);
        rightView(curr.right, result, currDepth + 1);
    }
}
