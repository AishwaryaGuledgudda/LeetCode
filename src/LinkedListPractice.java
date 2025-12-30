public class LinkedListPractice {

    public static class Node{

        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }

    }
    Node head;
    Node tail;
    int size=0;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +"->");
            temp=temp.next;
        }
        System.out.println("End");
        System.out.println("The size of the Linked-List is: "+size);
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;

        size++;
    }

    public void insertIndex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node = new Node(val);
        Node address = temp.next;
        temp.next=node;
        node.next=address;
        size++;

    }

    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }

        int val= tail.val;
        tail=temp;
        tail.next=null;
        size--;
        return val;

    }

    public int deleteIndex(int index){
        Node prev=head;
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    //LeetCode
    public boolean LinkedListCycle(){
        Node slow = head;
        Node fast = head;

        while(slow!=null&&fast!=null&&fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        LinkedListPractice llp = new LinkedListPractice();
        llp.insertFirst(4);
        llp.insertFirst(6);
        llp.insertFirst(9);
        llp.insertFirst(3);
        llp.insertLast(10);
        llp.insertIndex(69,3);
        //llp.display();
//        System.out.println("The deleted number is: "+llp.deleteFirst());
//        System.out.println("The deleted number in last is: "+llp.deleteLast());
        System.out.println("The deleted num in index location is:" +llp.deleteIndex(3));
        llp.display();

    }
}
