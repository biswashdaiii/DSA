import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class adjmatrixx {
    int v;
    int [][] matrix;
    adjmatrixx(int v){
        this.v=v;
        matrix=new int[v][v];
    }

    void addEdge(int source, int destination ,int w){
        matrix[source][destination]=w;
        matrix[destination][source]=w;
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



    ///SHOETEST PATH BY BFS IN SINGLE SOURCE 
    int shortesPathBFS(int source, int destination){
        Queues q=new Queues(v);
        boolean [] visited=new boolean[v];
        int dist[]=new int[v];
        int prevpath[]=new int[v];

        for(int i=0; i<v; i++){
            dist[i]=Integer.MAX_VALUE;
            prevpath[i]=-1;
        }

        dist[source]=0;
        visited[source]=true;
        q.enqueue(source);
        while(!q.isEmpty()){
            int u=q.dequeue();
            for(int j=0;j<v;j++){
                if(matrix[u][j]!=0){
                    if(!visited[j]){
                        if(dist[u]+1<dist[j]){
                            dist[j]=dist[u]+1;
                            prevpath[j]=u
                            q.enqueue(j);
                            visited[j]=true;
                        }
                    }
                }
            }
        }
        Stack<Integer> stk=new Stack<>();
        stk.push(destination);
        int x = prevpath[destination];
        while(x!=-1){
            stk.push(x);
            x=prevpath[x];
        }
        System.out.println("printing path");
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        return dist[destination];
    }

    ///DIAJKSTRA ALGORITHM FOR WEIGHTED GRAPH   
    int dijkstra(int source, int destination){
        int dist[]=new int[v];
        boolean [] visited=new boolean[v];
        int prevpath[]=new int[v];

        for (int i=0;i<v;i++){
            dist[i]=Integer.MAX_VALUE;
            prevpath[i]=-1;

        }
        dist[source]=0;
        for(int i=0;i<v;i++){
            int u=findMinVertex(visited,dist);
            visited[u]=true;
            for(int j=0;j<v;j++){
                if(matrix[u][j]!=0){
                    if(!visited[j] && dist[u]+matrix[u][j]<dist[j]){
                        dist[j]=dist[u]+matrix[u][j];
                        prevpath[j]=u;

                    }
                }
            }

        }
        //print path
        Stack<Integer> stk=new Stack<>();
        stk.push(destination);
        int x = prevpath[destination];
        while(x!=-1){
            stk.push(x);
            x=prevpath[x];
        }
        System.out.println("printing path");
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        return dist[destination];

     
    }
    int findMinVertex(boolean visited[],int dist[]){
        int minvertex=-1;
        for(int i=0;i<v;i++){
          if(!visited[i] && dist[i]!=Integer.MAX_VALUE && (minvertex==-1 || dist[i]<dist[minvertex])){
            minvertex=i;
          }

        }
        return minvertex;

    }
  


    public static void main(String[] args) {
        AdjMatrix adj=new AdjMatrix(6);
        adj.addEdge(0,1,w:10);
        // adj.addEdge(0,2);
        // adj.addEdge(0,5);
        // adj.addEdge(1,3);
        // adj.addEdge(2,3);
        // adj.addEdge(2,5);
        // adj.addEdge(3,4);
        // adj.addEdge(4,5);
        adj.printGraph();
    }
}
 