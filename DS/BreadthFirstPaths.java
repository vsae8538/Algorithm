import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


public class BreadthFirstPaths {
    private boolean[] marked; //標記已拜訪的頂點
    private int[] edgeTo; //從起點到某個頂點的已知路徑的最後一個頂點 
    private final int s; //起點

    public BreadthFirstPaths(Graph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G,s);
    }

    private void bfs(Graph G, int s){
        Queue<Integer> queue = new LinkedList<Integer>();
        marked[s] = true;
        queue.offer(s);
        while(!queue.isEmpty()){
            int v = queue.poll();
            for(int w : G.adj(v)){
                if(!marked[w]){
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.offer(w);
                }
            }
        }
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
