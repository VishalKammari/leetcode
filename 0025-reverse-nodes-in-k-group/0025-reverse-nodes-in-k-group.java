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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(count<k){
            return head;
        }

        ListNode prev=null;
        ListNode next=null;
        curr=head;
        int n=0;
        while(curr!=null && n<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            n++;
        }

        head.next=reverseKGroup(curr,k);

        return prev;

    }
}