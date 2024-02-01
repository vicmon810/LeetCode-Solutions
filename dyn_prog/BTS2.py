# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def generateTrees(self, n: int) -> List[Optional[TreeNode]]:
        def generator(left, right):
            if left == right:
                return [TreeNode(left)]

            if left > right:
                return [None]

            res = []
            for val in range(left, right + 1):
                for leftTree in generator(left, val - 1):
                    for rightTree in generator(val + 1, right):
                        root = TreeNode(val, leftTree, rightTree)
                        res.append(root)
            return res

        return generator(1, n)
