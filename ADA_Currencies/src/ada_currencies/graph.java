package ada_currencies;

public class graph {
    int v, e;
    Edge[] edge;
    
    public graph(int v, int e) {
        this.v = v;
        this.e = e;
        edge = new Edge[e];
        
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }
    
    public void bellmanFord(graph graph, int src) {
        int v = graph.v;
        int e = graph.e;
        double dist[] = new double[v];
        
        
        for (int i = 0; i < v; i++) {
            dist[i] = Double.POSITIVE_INFINITY;
        }
        dist[src] = 0;
        
        
        for (int i = 1; i < v; i++) {
            for (int j = 0; j < e; j++) {
                int u = graph.edge[j].src;
                int V = graph.edge[j].dest;
                double w = graph.edge[j].w;
                
                if (dist[u] != Double.POSITIVE_INFINITY && dist[u] + w < dist[V]) {
                    dist[V] = dist[u] + w;
                }
            }
        }
        
        for (int j = 0; j < e; j++) {
            int u = graph.edge[j].src;
            int V = graph.edge[j].dest;
            double w = graph.edge[j].w;
            
            if (dist[u] != Double.POSITIVE_INFINITY && dist[u] + w < dist[V]) {
                System.out.println("Graph contains negative cycle");
                return;
            }
        }
        
        printArr(dist, v);
    }
    
    public void printArr(double dist[], int v) {
        System.out.println("Distance from source");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "    " + dist[i]);
        }
    }
        
}
