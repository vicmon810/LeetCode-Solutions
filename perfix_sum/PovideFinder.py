class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        leftSum, rightSum = 0, sum(nums)
        print(rightSum)
        for idx, ele in enumerate(nums):
            rightSum -= ele
            if leftSum == rightSum:
                return idx
            leftSum += ele
        return -1

    print(pivotIndex(1, [1, 2, 3, 9, 10, 5]))
