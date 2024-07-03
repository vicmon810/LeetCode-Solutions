/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function(root) {
    let smaller = function(stack1, stack2){
        if (stack1 == null && stack2 == null) return true;
        if (stack1 == null) return false;
        if (stack2 == null) return false;

        if(stack1.val != stack2.val) return false;

        return smaller(stack1.left, stack2.right) && smaller(stack1.right, stack2.left);
    }
    return smaller(root.left, root.right);
};
