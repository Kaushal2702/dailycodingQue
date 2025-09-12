public class LinkedListcycle2 {
    static class Node{
       int val;
       Node next;
       Node(int val){
           this.val=val;
           this.next=null;
       }
    }
    // Display the Linked list
//    static void display(Node head){
//        Node curr=head;
//        if(curr==null){
//            return;
//        }
//        while(curr!=null){
//            System.out.print(curr.val+"->");
//            curr=curr.next;
//        }
//        System.out.println("null");
//
//    }
    // get index of given value
    static int  getIndex(Node head){

        Node slow=head;
        Node fast=head;
        int pos=1;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            System.out.println("No cycle detected");
            return -1;
        }
        slow=head;
        int index=0;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
            index++;
        }
        System.out.println(index);
        return index;
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(2);
        Node c=new Node(0);
        Node d=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        //display(a);
        getIndex(a);
    }

}
