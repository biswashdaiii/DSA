import java.util.ArrayList;
import java.util.List;

public class AdjList {
    int v;
    singlylinkedlist [] adjlist;
    public AdjList(int v) {
        this.v = v;
        adjlist = new singlylinkedlist[v];
        for (int i = 0; i < v; i++) {
            adjlist[i] = new singlylinkedlist();
        }
    }

    void addEdge(int source, int destination) {
        adjlist[source].addNode(destination);
        adjlist[destination].addNode(source);
    }

    void printGraph(){
        for (int i = 0; i < v; i++) {
            System.out.print(i +" is connected to ");
            singlylinkedlist.Node current=adjlist[i].head;
            while (current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }

    List<Integer> getAdjNodes(int i){
        List<Integer> list = new ArrayList<Integer>();
        singlylinkedlist.Node current=adjlist[i].head;
        while (current!=null){
            list.add(current.data);
            current=current.next;
        }
        return list;
    }
}