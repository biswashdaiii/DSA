import java.util.ArrayList;
import java.util.List;

public class AdjMatrix {
    int v;
    int [][] matrix;
    AdjMatrix(int v){
        this.v=v;
        matrix=new int[v][v];
    }

    void addEdge(int source, int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }

    void printGraph(){
        for(int i=0; i<v; i++){
            System.out.print(i +" is connected to ");
            for(int j=0; j<v; j++){
                if(matrix[i][j]!=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }

    List<Integer> getAdjNOdes(int i){
        List<Integer> list=new ArrayList<>();
        for(int j=0; j<v; j++){
            if(matrix[i][j]!=0){
                list.add(j);
            }
        }
        return list;
    }

    void BFS(int source){
        Queues q=new Queues(v);
        boolean [] visited=new boolean[v];
        visited[source]=true;
        q.enqueue(source);
        while(!q.isEmpty()){
            int u=q.dequeue();
            System.out.println(u);
            for(int j=0; j<v; j++){
                if(matrix[u][j]!=0){
                    if(!visited[j]){
                        q.enqueue(j);
                        visited[j]=true;
                    }
                }
            }
        }
    }
    void dfs(boolean [] visited,int source){
       visited[source]=true;
        System.out.println(source);
        for(int j=0; j<v; j++){
            if(matrix[source][j]!=0){
                if(!visited[j]){
                    dfs(visited,j);
                }
            }
        }
    }

    void depthFirstSearch(int source){
        boolean [] visited=new boolean[v];
        dfs(visited,source);
    }

    public static void main(String[] args) {
        AdjMatrix adj=new AdjMatrix(6);
        adj.addEdge(0,1);
        adj.addEdge(0,2);
        adj.addEdge(0,5);
        adj.addEdge(1,3);
        adj.addEdge(2,3);
        adj.addEdge(2,5);
        adj.addEdge(3,4);
        adj.addEdge(4,5);
        adj.printGraph();
    }
}