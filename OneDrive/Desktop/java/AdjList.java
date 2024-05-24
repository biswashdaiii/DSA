import java.util.ArrayList;
import java.util.List;

public class AdjList {
    int v;
    singlylinkedlist[] adjList;
    public AdjList(int v){
        this.v=v;
        adjList=new singlylinkedlist[v];
        for(int i =0 ; i<v; i++){
            adjList[i]= new singlylinkedlist();
        }
        
    }

    void addEdge(int source,int destination){
        adjList[source].addNode(destination);
        adjList[destination].addNode(source);

    }
     void printgraph(){
        for (int i=0; i<v; i++){
            System.out.print(i+"is connected");
            singlylinkedlist.Node current=adjList[i].head;
            while(current!=null){
                System.out.print(current.data+"");
                current=current.next;
            }
        }
    }
    List<Integer>getAdjNodes(int i){
        List<Integer>List=new ArrayList<Integer>();
         singlylinkedlist.Node current=adjList[i].head;
            while(current!=null){
                System.out.print(current.data+"");
                current=current.next;

    }
    return List;
}
}