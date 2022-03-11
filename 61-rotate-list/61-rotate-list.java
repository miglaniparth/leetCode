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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0){
            return head;
        }
        if(head==null){
            return null;
        }
        ListNode newHead;
        ListNode current=head;
        int n=1;
        while(current.next!=null){
            n++;
            current=current.next;
        }
        if(n==1){
            return head;
        }
        if(k>n){
            k=k%n;
        }
        current=head;
        for(int i=0;i<n-k;i++){
            current=current.next;
        }
     if(k==0){
            return head;
        }
        newHead=current;
        while(current.next!=null){
            current=current.next;
        }
        current.next=head;
        current=head;
        while(current.next!=newHead){
            current=current.next;
        }
        current.next=null;
        return newHead;
    }
}