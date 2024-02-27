/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public void deleteNode(ListNode node) {
        if(node!=null && node.next!=null){
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}  




    //     ListNode vac=new ListNode (0);

    //     ListNode temp=vac;
    //     vac.next=head;
    //     while(temp.next!=null){
    //       if(temp.next.val==node){
    //         temp.next=temp.next.next;
    //       }
    //       else{
    //           temp=temp.next;
    //       }
    //     }
    //     return temp;
    // }
