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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ish []=new ListNode[k];
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int size=count/k;
        int extra= count%k;
        int h=0;
        temp=head;
        ListNode prev=null;
        while(temp!=null && h<k){
            ListNode temp1=temp;
            for(int i=0;i<size;i++){
                prev=temp;
                temp=temp.next;
            }
            if(extra!=0){
                prev=temp;
                temp=temp.next;
                extra--;
            }
            prev.next=null;
            ish[h++]=temp1;
        }

        return ish;
    }
}