/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
       ListNode front =new ListNode(0,head);
       ListNode temp =front;
       while(temp!=null){
        int preSum=0;
        ListNode end=temp.next;
        while(end!=null){
            preSum=preSum+end.val;
            if(preSum == 0){
                temp.next=end.next;
            }
            end=end.next;
        }
        temp=temp.next;
       }

        return front.next;
    }
}