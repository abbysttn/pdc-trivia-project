package ada_currencies;

public class Bellman {

    public static boolean bellmanFord(int n, double[][] graph, int src, int[] pre, double[] dist) {
        for (int i = 0; i < n; i++) {
            dist[i] = 999;
            pre[i] = -1;
        }
        dist[src] = 0;

        //relax all edges
        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (int v = 0; v < n; v++) {
                    double w = graph[u][v];
                    if (dist[u] != 999) {
                        if (dist[u] + w < dist[v]) {
                            dist[v] = dist[u] + w;
                            pre[v] = u;
                        }
                    }
                }
            }
        }

        
        //check for neg cycles
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                double w = graph[u][v]; 
                if (dist[u] + w < dist[v]) { //if true then re-relax the edges for the arbitrage rates
                    relaxEdges(dist, pre, n, graph, src);
                    return true;
                }
            }
        }

        return false;
    }

    private static void relaxEdges(double[] dist, int[] pre, int n, double[][] graph, int src) {
        for (int i = 0; i < n; i++) {
            dist[i] = 999;
            pre[i] = -1;
        }
        dist[src] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (int v = 0; v < n; v++) {
                    double w = graph[v][u];
                    if (dist[u] != 999) {
                        if (dist[u] + w < dist[v]) {
                            dist[v] = dist[u] + w;
                            pre[v] = u;
                        }
                    }
                }
            }
        }
    }
}
