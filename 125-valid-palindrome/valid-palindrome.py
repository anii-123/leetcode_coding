class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s=s.lower()
        rev=""
        for i in s:
            if 'a'<=i<='z' or '0'<=i<='9':
                rev+=i
        if rev==rev[::-1]:
            return True
        else:
            return False
        