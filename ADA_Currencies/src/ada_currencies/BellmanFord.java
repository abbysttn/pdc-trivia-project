package ada_currencies;

public class BellmanFord {

    graph graph;
    int v;
    int e;
    double dist[];
    int pre[];

    public BellmanFord(graph graph) {
        this.graph = graph;
        this.v = graph.v;
        this.e = graph.e;
        this.dist = new double[v];
        this.pre = new int[v];
    }

    public void bellman(int src) {
        //make all inf
        for (int i = 0; i < v; i++) {
            dist[i] = Double.POSITIVE_INFINITY;
            pre[i] = -1;
        }
        dist[src] = 0;

        // find path
        for (int i = 1; i < v; i++) {
            for (int j = 0; j < e; j++) {
                int u = graph.edge[j].src;
                int v = graph.edge[j].dest;
                double w = graph.edge[j].w;

                if (dist[u] != Double.POSITIVE_INFINITY && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pre[v] = u;
                    
                    System.out.println("Relaxed edge from " + u + " to " + v + " with weight: " + w);
                }
            }
        }

        //negative cycle
        for (int j = 0; j < e; j++) {
            int u = graph.edge[j].src;
            int v = graph.edge[j].dest;
            double w = graph.edge[j].w;

            if (dist[u] != Double.POSITIVE_INFINITY && dist[u] + w < dist[v]) {
                System.out.println("Negative weight cycle detected - Arbitrage found...");
                printArb(v);
                return;
            }
        }

        printArray(dist, v);
    }

    public void printArray(double dist[], int v) {
        System.out.println("Distance");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "    " + dist[i]);
        }
    }

    public void printArb(int start) {
        System.out.println("Arbitrage path:\n");

        int current = start;

        for (int i = 0; i < v; i++) {
            current = pre[current];
        }

        int cStart = current;
        System.out.print("Cycle: " + cStart);
        current = pre[cStart];

        while (current != cStart) {
            System.out.print(" -> " + current);
            current = pre[current];
        }

        System.out.println(" -> " + cStart);
    }
}
