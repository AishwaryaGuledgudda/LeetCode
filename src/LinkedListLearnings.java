public class LinkedListLearnings {

    static ListNode head ;
    static ListNode tail;
    static int size=0;

     static class ListNode{
         int val;
         ListNode next;

         ListNode(int val){
             this.val=val;
             this.next=null;
         }

     }
    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }



    public static void main(String[] args) {

         LinkedListLearnings ll = new LinkedListLearnings();
         ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(19);
        ll.insertFirst(6);
         ll.display();



    }
}
