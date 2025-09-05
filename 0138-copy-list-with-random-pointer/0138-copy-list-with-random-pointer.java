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
        HashMap<Node,Node> hm=new HashMap<>();
        if(head==null){
            return head;
        }
        Node newhead=new Node(head.val);
        Node oldtemp=head.next;
        Node newtemp=newhead;
        hm.put(head,newhead);
        while(oldtemp!=null){
            Node newnode=new Node(oldtemp.val);
            hm.put(oldtemp,newnode);
            newtemp.next=newnode;
            oldtemp=oldtemp.next;
            newtemp=newtemp.next;
        }

        oldtemp=head;
        newtemp=newhead;

        while(oldtemp!=null){
            newtemp.random=hm.get(oldtemp.random);
            newtemp=newtemp.next;
            oldtemp=oldtemp.next;
        }
        return newhead;
    }
}