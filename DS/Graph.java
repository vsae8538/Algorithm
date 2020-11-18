public class Graph {
    private final int V; //頂點
    private int E; //邊
    private Bag<Integer>[] adj; //記錄相鄰的兩個頂點

    public Graph(int V){
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[])new Bag[V];
        for(int v = 0; v < V;v++){
            adj[v] = new Bag<Integer>();
        }
    }

    public int V(){ return V;}
    public int E(){ return E;}
    public void addEage(int v, int w){ 
        adj[v].add(w); //v的相鄰頂點中添加w
        adj[w].add(v);  //w相鄰頂點中添加v
        E++; //增加邊數
    }
    public Iterable<Integer> adj(int v){ //輸出v的相鄰頂點
        return adj[v];   
    }
}
