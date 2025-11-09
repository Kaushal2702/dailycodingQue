public class linkedlistQue {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public  Node sumZero(Node head) {
        Node temp=head;
        Node dummyNode = new Node(-1);
        Node curr=dummyNode;
        int sum=0;
        while(temp!=null){
            if(temp.val!=0){
               sum+=temp.val;
            }
            else{
                if(sum!=0) {
                    curr.next = new Node(sum);
                    curr = curr.next;
                    sum = 0;
                }
            }
            temp=temp.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        Node a=new Node(0);
        Node b=new Node(1);
        Node c=new Node(5);
        Node d=new Node(0);
        Node e=new Node(6);
        Node f=new Node(0);
        Node g=new Node(1);
        Node h=new Node(3);
        Node i=new Node(0);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        linkedlistQue ll=new linkedlistQue();
        Node res=ll.sumZero(a);
        Node t=res;
        while(t!=null){
            System.out.print(t.val+"->");
            t=t.next;
        }


    }
}


