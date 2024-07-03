class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
         # Convert the integer to a string
        str_x = str(x)
        # Reverse the string
        reversed_str_x = str_x[::-1]
        
        # Check if the original string and the reversed string are the same
        if str_x == reversed_str_x:
            return True
        else:
            return False
