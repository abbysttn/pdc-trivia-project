/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada_currencies;

/**
 *
 * @author abbys
 */
public class bestExchange {
    final double inf = Double.POSITIVE_INFINITY;
    
    public void floydWarshall(double dist[][]) {
        int v = dist.length;
        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        printSolution(dist);
    }
    
    public void printSolution(double dist[][]) {
        int v = dist.length;
        System.out.println("Shortest path between vertices:\n");
        
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (dist[i][j] == inf) {
                    System.out.print("inf ");
                } else {
                    System.out.print(dist[i][j] + "   ");
                }
                System.out.println("");
            }
        }
    }
}
