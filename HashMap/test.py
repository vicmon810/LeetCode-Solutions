from typing import List


class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        a = 0
        b = []
        for i in range(len(grid)):
            c = []
            for j in range(len(grid)):
                c.append(grid[j][i])
            b.append(c)
        d = 0
        for i in range(len(grid)):
            for j in range(0, len(grid[i])):
                if grid[i] == b[j]:
                    d += 1
        return d


# Create an instance of the Solution class
solution_instance = Solution()

# Call the equalPairs method with the provided input
result = solution_instance.equalPairs([[3, 2, 1], [1, 7, 6], [2, 7, 7]])

# Print the result
print(result)
