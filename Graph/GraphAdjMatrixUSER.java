package Graph;

import java.util.Scanner;

public class GraphAdjMatrixUSER {
    static class InnerGraphAdjMatrixUSER {
        int adjMatrix[][];

        public void makeGraph(int V, int E) {
            adjMatrix = new int[V][V];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt() - 1;
                int v = sc.nextInt() - 1;
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
            sc.close();
        }

        public void printGraph() {
            for (int i = 0; i < adjMatrix.length; i++) {
                for (int j = 0; j < adjMatrix[i].length; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vertices and edges: ");
        int V = sc.nextInt();
        int E = sc.nextInt();
        InnerGraphAdjMatrixUSER obj = new InnerGraphAdjMatrixUSER();
        obj.makeGraph(V, E);
        obj.printGraph();
        sc.close();
    }
}
