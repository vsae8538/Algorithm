import java.util.LinkedList;
import java.util.Queue;

public class KruskalMST {

    private static final double FLOATING_POINT_EPSILON = 1E-12;

    private double weight;                       
    private Queue<Edge> mst = new LinkedList<Edge>(); 

    public KruskalMST(EdgeWeightedGraph G) {
        MinPQ<Edge> pq = new MinPQ<Edge>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        }

        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if (uf.find(v) != uf.find(w)) { 
                uf.union(v, w); 
                mst.offer(e);
                weight += e.weight();
            }
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }

    public double weight() {
        return weight;
    }
}
