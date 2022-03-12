/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
  
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node current=head;
        while(current!=null){
            Node temp=new Node(current.val);
            temp.next=current.next;
            current.next=temp;
            current=temp.next;
        }
        current=head;
        while(current!=null && current.next!=null){
            if(current.random==null){
                current.next.random=null;
            }
            else{
            current.next.random=current.random.next;
            }
            current=current.next.next;
        }
        Node ans=head.next;
        current=head;
        while(current.next.next!=null && current.next!=null && current!=null){
            Node temp = current.next;
            current.next=current.next.next;
            temp.next=current.next.next;
            current=current.next;
        }
        current.next=null;
        return ans;
    }
}