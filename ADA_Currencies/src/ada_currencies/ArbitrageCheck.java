package ada_currencies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArbitrageCheck {

    public static boolean detectArbitrage(int n, String[] currency, double[][] rates) {
        double[][] graph = exchange.convertToWeights(rates);
        int[] pre = new int[n];
        double[] dist = new double[n];

        for (int src = 0; src < n; src++) {
            if (Bellman.bellmanFord(n, graph, src, pre, dist)) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Arbitrage found!\n");
                double product = printCycle(src, pre, currency, rates);
                System.out.printf("%.2f", (product - 1) * 100);
                System.out.println("% profit!");
                System.out.println("No best conversion detected.");
                System.out.println("-----------------------------------------------------\n\n");
                return true;
            }
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("No Arbitrage detected.\n");
        return false;
    }

    public static void findBestConversion(int n, String[] currency, double[][] rates, int src, int end) {
        double[][] graph = exchange.convertToWeights(rates);
        int[] pre = new int[n];
        double[] dist = new double[n];

        Bellman.bellmanFord(n, graph, src, pre, dist);

        if (dist[end] == 999) {
            System.out.println("No conversion path from " + currency[src] + " to " + currency[end]);
            return;
        }

        double bestRate = findShortestPath(n, currency, rates, src, end);

        System.out.println("Best conversion rate from " + currency[src] + " to " + currency[end] + " is " + bestRate);
        System.out.println("-----------------------------------------------------\n\n");
    }

    public static double findShortestPath(int n, String[] currency, double[][] rates, int src, int end) {
        double[][] graph = exchange.convertToWeights(rates);
        int[] pre = new int[n];
        double[] dist = new double[n];

        if (Bellman.bellmanFord(n, graph, src, pre, dist)) {
            System.out.println("Arbitrage opportunity found, cannot determine shortest path.\n");
            return -1;
        }

        List<Integer> path = new ArrayList<>();
        for (int current = end; current != -1; current = pre[current]) {
            path.add(current);
        }

        Collections.reverse(path);

        double conversionRate = 1.0;
        for (int i = 0; i < path.size() - 1; i++) {
            conversionRate *= rates[path.get(i)][path.get(i + 1)];
        }

        System.out.println("Shortest path from " + currency[src] + " to " + currency[end] + ":");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(currency[path.get(i)]);
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();

        return conversionRate;
    }

    public static double printCycle(int start, int[] pre, String[] currency, double[][] rates) {
        boolean[] visited = new boolean[pre.length];
        List<Integer> c = new ArrayList<>();
        int current = start;

        while (!visited[current]) {
            c.add(current);
            visited[current] = true;
            current = pre[current];
        }

        c.add(start);

        List<String> cu = new ArrayList<>();

        for (int i = c.indexOf(start); i < c.size(); i++) {
            System.out.print(currency[c.get(i)]);
            cu.add(currency[c.get(i)]);
            if (i < c.size() - 1) {
                System.out.print(" -> ");
            }
        }

        double product = getArbitrageRate(cu, currency, rates);
        System.out.println(":   " + product);
        return product;
    }

    private static double getArbitrageRate(List<String> cu, String[] currency, double[][] rates) {
        double logSum = 1.0;
        int prev = -1;

        for (String name : cu) {
            for (int i = 0; i < currency.length; i++) {
                if (name.equals(currency[i])) {
                    if (prev != -1) {
                        int cur = i;
                        logSum *= rates[prev][cur];
                        prev = cur;
                    } else {
                        prev = i;
                    }
                }
            }
        }

        return logSum;
    }
}
