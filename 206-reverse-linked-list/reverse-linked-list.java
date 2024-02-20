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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        ListNode front;
        while(temp!=null){
            front =temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}


        // ListNode temp=head;
        // int count=0;
        // while(temp!=null){
        //     temp=temp.next;
        // }
        // temp=head;
        // for(int i=count/2;i>0;i--){
        //     temp=temp.next;
        // }
        // return temp;