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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newlist=reverse(head);
        if(n==1)
        return reverse(newlist.next);
        ListNode curr=head;
        for(curr=newlist; curr != null && n-1>1 ; curr=curr.next){
            n--;
        }
        curr.next=curr.next.next;
        return reverse(newlist);
    }

     public static ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }
}