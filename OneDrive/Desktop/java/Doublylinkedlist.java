public class Doublylinkedlist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }

    }
    Node head=null;
    Node tail=null;
    void insertNode(int data){
        Node newNode=new Node(data);
        if (head==null || tail ==null){
            head = tail = newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    void  printList(){
        Node current = head;
        while(current != null ){
            System.out.print(current.data+" ");
            current = current.next;


        }

    }
}
