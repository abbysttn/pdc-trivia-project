package ada_currencies;

public class ADA_Currencies {

    static double inf = Double.POSITIVE_INFINITY;

    static double[][] test1 = new double[][]{
        // NZD(0)  GBP(1) JPY(2) CHF(3) SBD(4)
        {inf, 0.47d, 88.2d, 0.52d, 5.12d},
        {2.13d, inf, 187.33d, 1.11d, 10.91d},
        {0.011d, 0.0053d, inf, 0.0059d, 0.058d},
        {1.92d, 0.9d, 168.72d, inf, 9.83d},
        {0.2d, 0.092d, 17.16d, 0.1d, inf}
    };
    
    static double[][] test3 = {
        // A  B  C
        {inf, 1, 0.5},   // A to others
        {0.5, inf, 2},   // B to others
        {2, 0.5, inf}    // C to others
    };

    // nzd -> gbp -> chf -> nzd = A
    //
    static double[][] test2 = {
        // A B C D
        {0, 4, 1, inf},
        {inf, 0, 2, -6},
        {inf, inf, 0, 3},
        {inf, 1, inf, 0}
    };

    public static double[][] convertToLog(double[][] matrix) {
        int n = matrix.length;
        double[][] logMatrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    logMatrix[i][j] = 0;
                } else if (matrix[i][j] == inf) {
                    logMatrix[i][j] = inf;
                } else {
                    logMatrix[i][j] = -Math.log10(matrix[i][j]);
                }
            }
        }

        return logMatrix;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //bellman(nz, australia, usd, 1.5, 1.2, 0.4);

        /*String[] c = {"NZD", "GBP", "JPY", "CHF", "SBD"};
        double[][] test = convertToLog(test1);
        int numC = 3;
        int numE = numC * (numC - 1);

        graph graph = new graph(numC, numE);

        int edgeIndex = 0;

        for (int i = 0; i < numC; i++) {
            for (int j = 0; j < numC; j++) {
                if (i != j && test[i][j] != Double.POSITIVE_INFINITY) {
                    graph.edge[edgeIndex].src = i;
                    graph.edge[edgeIndex].dest = j;
                    graph.edge[edgeIndex].w = test[i][j];
                    edgeIndex++;
                }
                System.out.println("Edge from " + i + " to " + j + " with weight: " + test[i][j]);
            }
        }
        
        
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].w = 1;
        
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].w = 0.5;
        
        graph.edge[2].src = 1;
        graph.edge[2].dest = 0;
        graph.edge[2].w = 0.5;
        
        graph.edge[3].src = 1;
        graph.edge[3].dest = 2;
        graph.edge[3].w = 2;
        
        graph.edge[4].src = 2;
        graph.edge[4].dest = 0;
        graph.edge[4].w = 2;
        
        graph.edge[5].src = 0;
        graph.edge[5].dest = 1;
        graph.edge[5].w = 0.5;

        BellmanFord bellman = new BellmanFord(graph);

        graph.bellmanFord(graph, 2);*/
        
        bestExchange best =  new bestExchange();
        best.floydWarshall(test1);
    }

    //anything greater than 1 is an arbritage opportunity.
    //if the sum of weights is negative, means arbritage opportunity.
    //task 1
    //find arbritage opportunities.
    //input -> a nxn matrix
    //output -> indication of arbritage
    //if arbritage, show the steps
}
