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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode ans=dummy;
        while(true){
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<lists.length;i++){
                ListNode list=lists[i];
                if(list!=null){
                    if(list.val<min){
                        min=list.val;
                        dummy.next=list;
                        // lists[i]=lists[i].next;
                        index=i;
                    }
                }
            }
            if(min==Integer.MAX_VALUE){
                break;
            }
            if(dummy.next!=null){
                dummy=dummy.next;
                lists[index]=lists[index].next;
            }
        }
        return ans.next;
    }
}
