class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n==0:
            return 0
        num3=0
        num1 = 0
        num2 = 1
        for i in range(n) :
            num3=num1+num2
            num1=num2
            num2=num3
            
            # temp = curr
            # curr = prev + curr
            # prev = temp
        
        return num3

        