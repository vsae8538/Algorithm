import java.util.Stack;

public class DepthFirstPaths {
    private boolean[] marked; //標記已拜訪的頂點
    private int[] edgeTo; //從起點到某個頂點的已知路徑的最後一個頂點 
    private final int s; //起點
    
    public DepthFirstPaths(Graph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G ,s); //開始走訪
    } 

    private void dfs(Graph G, int v){
        marked[v] = true;
        for(int w : G.adj(v)){
            if(!marked[w]){
                edgeTo[w] = v; //到w的已知路徑的最後一個可抵達頂點 (表示可以從v到w這個頂點) 
                dfs(G, w);
            }
        }
    }
    
    public boolean hasPathTo(int v){
        return marked[v];
    }

    /**
     * 利用Stack,輸出可到某個頂點的路徑
     */
    public Iterable<Integer> pathTo(int v){
        if(!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for(int x = v;x != s;x = edgeTo[x]){
            path.push(x);     
        }
        path.push(s);
        return path;
    }

}
