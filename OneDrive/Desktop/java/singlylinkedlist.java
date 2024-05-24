public class singlylinkedlist {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
            
        }
    }
    int size=0;
    Node head =null;
    Node tail = null;
    void addNode(int data){
        Node  newnode = new Node(data);
        if (head == null || tail == null) {
            head = tail  = newnode ;
        }else{
            tail.next = newnode ;
            tail = newnode ;

            // Node current = head;
            // while(current.next!=null){
            //     current = current.next;
            // }
            // current.next=newnode;
        }
        size++;
    }
    
    void addHeadfirst(int data){
        Node newnode = new Node(data);
        if(head==null ||  tail==null){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        size++;
    }

    void  printList(){
        Node current = head;
        while(current != null ){
            System.out.print(current.data+" ");
            current = current.next;


        }

    }
    
}
