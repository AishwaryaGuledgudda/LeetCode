public class LinkedListPractice {

    public static class Node{

        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }

    }
    static Node head;
    static  Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +"->");
            temp=temp.next;
        }
        System.out.println("End");
    }



    public static void main(String[] args) {
        LinkedListPractice llp = new LinkedListPractice();
        llp.insertFirst(4);
        llp.insertFirst(6);
        llp.insertFirst(9);
        llp.insertFirst(3);
        llp.display();
    }
}
