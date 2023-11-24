class Solution(object):
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """

        totalDiff = []
        counter = 1

        for i in range(1, len(chars)):
            if chars[i] == chars[i - 1]:
                counter += 1
            else:
                totalDiff.append([chars[i - 1], counter])
                counter = 1
        totalDiff.append([chars[-1], counter])
        print(totalDiff)
        i = 0
        for key, value in totalDiff:
            chars[i] = key
            i += 1
            if value > 1:
                for item in str(value):
                    chars[i] = str(item)
                    i += 1
        print(i)
        return i


Solution = Solution()
print(Solution.compress(["a", "a", "b", "b", "c", "c", "c"]))
print(Solution.compress(["a", "b", "b", "b", "b", "c", "c"]))
print(Solution.compress(["a", "a", "c", "c", "c", "c", "c"]))
