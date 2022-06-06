/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode helperA=headA, helperB= headB;
        while(helperA!=helperB){
            helperA=helperA==null?headB:helperA.next;
            helperB=helperB==null?headA:helperB.next;
        }
        return helperA;
    }

}