public class pldlinkedlist {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public Node findmiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public boolean check(Node head){
         if(head==null || head.next==null ) return true;
         Node mid=findmiddle(head);
         Node sec=reverse(mid.next);
         mid.next=null;
         Node first=head;
         while(sec!=null){
             if(first.val!=sec.val) return false;
             first=first.next;
             sec=sec.next;
         }
         return true;

    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        pldlinkedlist obj=new pldlinkedlist();
        System.out.println(obj.check(a));
    }
}
