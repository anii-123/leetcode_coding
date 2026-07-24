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
        temp = ListNode(0)
        current = temp
        c = 0

        while l1 or l2 or c:
            #x = l1.val if l1 else 0
            #y = l2.val if l2 else 0
            if l1:
                x=l1.val
            else:
                x=0

            if l2:
                y=l2.val
            else:
                y=0
        

            total = x + y + c
            c = total // 10

            current.next = ListNode(total % 10)
            current = current.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return temp.next
        