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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode total=ans;
        int carry=0,n1,n2;
        while(l1!=null || l2!=null){
            if(l1!=null){
                n1=l1.val;
            }
            else{
                n1=0;
            }
            if(l2!=null){
                n2=l2.val;
            }
            else{
                n2=0;
            }
            int sum=carry+n1+n2;
            carry=sum/10;
            sum%=10;
            ans.next=new ListNode(sum);
            ans=ans.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry!=0){
            ans.next=new ListNode(carry);
        }
        return total.next;
    }
}