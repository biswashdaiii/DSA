import java.util.HashMap;

public class LRUCaching {
    public static class Node {
        int k;
        int v;
        Node next;
        Node prev;
        public Node (int k , int v){
            this.k =k;
            this.v = v;
            this.next = null;
            this.prev=null;
        }

    
        
    } 
    HashMap<Integer,Node> map;
    int capacity;
    LRUCaching(int capacity){
        this. capacity = capacity;
        map= new HashMap<>(capacity);
    }
    void  put(int k, int v) {
        if (map.containsKey(k)){
            remove(map.get(k));
        }else if(map.size()==capacity){
            remove(tail);
        }else{
            Node newnode = new Node(k,v);
            insert(newnode);
        }
        int get(int k){
            Node node = map.get(k);
            if(node==null){
                return -1;
            }
            remove(node);
            insert(node);
            return node.v;
        }

    }
    Node dummyhead = new Node(k: '0',v:'0');
    Node dummytail = new Node(k:'0',v:'0');
    Node tail = null;
    void insert(Node newnode){
        map.put(newnode.k,newnode);
        if  (dummyhead.next == null  || dummytail.prev== null){
            dummyhead .next = newnode ;
            newnode.prev=dummyhead;
            newnode.next = dummytail;
            dummytail.prev=newnode;

        }else{
            newnode.prev=dummyhead;
            newnode.next=dummyhead.next;
            dummyhead.next.prev=newnode;
            dummyhead.next=newnode;
        }
    }
    void remove(Node node){
        map.remove(node.k);
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=null;
        node.prev=null;
    }
    
}
