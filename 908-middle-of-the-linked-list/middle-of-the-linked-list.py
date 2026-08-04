# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        
        def len():
            current=head
            count=0

            while current:
                count+=1
                current=current.next
            return count

        current=head
        m=len()//2+1
        position=0
        while current:
            position+=1
            if position is m:
                return current 
            current=current.next
        

        

            