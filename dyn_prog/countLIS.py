from typing import List


class Solution:
    def findNumberOfLIS(self, nums: List[int]) -> int:
        dp = {}
        LIS, count = 0, 0

        for i in range(len(nums) - 1, -1, -1):
            maxlen, maxcount = 1, 1
            for j in range(i + 1, len(nums)):
                if nums[i] < nums[j]:
                    leng, cou = dp[j]
                    if leng + 1 > maxlen:
                        maxlen, maxcount = leng + 1, cou
                    elif leng + 1 == maxlen:
                        maxcount += cou
                        print(maxcount)

            if maxlen > LIS:
                LIS, count = maxlen, maxcount
            elif maxlen == LIS:
                count += maxcount
                print(count)

            dp[i] = [maxlen, maxcount]

        return count


solution = Solution()
result = solution.findNumberOfLIS([2, 2, 2, 2, 2])
print(result)
