public class LLsort {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static Node sort(Node head) {
        // if(head==null) return null;
        // ListNode curr=head;
        // while(curr!=null){
        //     ListNode curr1=curr.next;
        //     while(curr1!=null){
        //         if(curr.val>curr1.val){
        //         int temp= curr.val;
        //         curr.val=curr1.val;
        //         curr1.val=temp;
        //     }
        //     curr1=curr1.next;
        // }
        // curr=curr.next;
        // }
        // return head;

        //************** */ merge sort*************
        if(head==null || head.next==null) return head;
        Node mid=getMiddle(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node left=sort(head);
        Node right=sort(rightHead);
        return merge(left,right);
    }
    public  static Node getMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static Node merge(Node l1, Node l2){
        Node dummy =new Node(-1);
        Node tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;

            }
            tail=tail.next;
        }
        if(l1!=null) tail.next=l1;
        if(l2!=null ) tail.next=l2;
        return dummy.next;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(2);
        Node c=new Node(1);
        Node d=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        Node sorted=sort(a);
        printList(sorted);
    }

}

