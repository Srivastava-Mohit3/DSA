package Graph;

public class GraphAdjMatrix {
    static class Graph {
        int adjMatrix[][];

        public void makeGraph(int V, int edges[][]) {
            adjMatrix = new int[V][V];
            for (int edge[] : edges) {
                int u = edge[0] - 1;
                int v = edge[1] - 1;
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }

        public void printGraph() {
            int V = adjMatrix.length;
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int edges[][] = {
                { 1, 3 },
                { 1, 2 },
                { 1, 5 },
                { 2, 3 },
                { 2, 4 },
                { 3, 5 },
                { 4, 5 }
        };
        Graph g = new Graph();
        g.makeGraph(V, edges);
        g.printGraph();
    }
}
