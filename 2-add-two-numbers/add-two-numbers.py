# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # res = ListNode(0)
        # current = res
        # total=0
        # c = 0
        # while l1 or l2 or c:
        #     #x = l1.val if l1 else 0
        #     #y = l2.val if l2 else 0
        #     if l1:
        #         x=l1.val
    
        #     else:
        #         x=0
                

        #     if l2:
        #         y=l2.val
                
        #     else:
        #         y=0
               

        #     total = x + y + c
        #     c = total // 10
        #     current.next = ListNode(total % 10)
        #     current = current.next
        #     if l1:
        #         l1 = l1.next
        #     if l2:
        #         l2 = l2.next
        # return res.next


        res=ListNode()
        temp=res
        total=0
        carry=0
        while l1 or l2 or carry:
            if l1:
                num1=l1.val
            else:
                num1=0
            
            if l2:
                num2=l2.val
            else:
                num2=0
            total= num1+num2+carry
            carry=total//10
            total= total%10

            temp.next=ListNode()
            temp=temp.next
            temp.val=total

            if l1:
                l1=l1.next
            if l2:
                l2=l2.next
        return res.next
           






    
        