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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h=new ListNode();
        ListNode temp=head;
       h=temp;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
               // temp=temp.next;
                temp.next=temp.next.next;

            }else{
             temp=temp.next;
            }

        }
        return h;
    }
}