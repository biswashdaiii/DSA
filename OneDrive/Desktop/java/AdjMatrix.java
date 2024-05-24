import java.util.ArrayList;
import java.util.List;

public class AdjMatrix {
    int v;
    int [][] matrix;
    AdjMatrix(int v){
        this.v= v;
        matrix=new int[v][v];
    }

    void addEdge(int source,int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    void printgraph(){
        
       
        for (int i=0;i<v;i++){
            System.out.print(i+"is connected to");
            for(int j=0; j<v; j++){
                if(matrix[i][j]!=0){
                    System.out.print(j+"");
                }

            }
            System.out.println();
        }

    }
    List<Integer> getAdjNodes(int i){
        List<Integer> List=new ArrayList<>();
        for(int j=0; j<v; j++){
            if(matrix[i][j]!=0){
                List.add(j);
            return List;
            }

            void dfs(boolean[] visited,int source){
                
            }
            void depthFirstSearch(int source){
                boolean[] visited=new boolean[v];
                dfs(visited,source);
            }
        }
   public static void main(String[] args) {
    AdjMatrix adj = new AdjMatrix(6);
    adj.addEdge(0, 1);
    adj.addEdge(0, 2);  
    adj.addEdge(0, 5);
    adj.addEdge(1, 3);
    adj.addEdge(2,3);
    adj.addEdge(2, 5);
    adj.addEdge(3, 4);
    adj.addEdge(4, 5);
    adj.printgraph();
   } 
}
