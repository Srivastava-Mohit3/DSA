package Graph;

import java.util.*;

public class GraphAdjListReturn {

    static class InnerGraph {

        public List<List<Integer>> makeGraph(int V, int[][] edges) {
            List<List<Integer>> adjList = new ArrayList<>();

            // initialize adjacency list
            for (int i = 0; i < V; i++) {
                adjList.add(new ArrayList<>());
            }

            // add edges (undirected)
            for (int[] edge : edges) {
                int u = edge[0] - 1;
                int v = edge[1] - 1;

                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }

            return adjList; // ✅ returning the graph
        }

        public void printGraph(List<List<Integer>> adjList) {
            for (int i = 0; i < adjList.size(); i++) {
                System.out.print((i + 1) + " -> ");
                for (int j = 0; j < adjList.get(i).size(); j++) {
                    int node = adjList.get(i).get(j) + 1;
                    System.out.print(node + (j + 1 < adjList.get(i).size() ? " " : ""));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
                {1, 3},
                {1, 2},
                {1, 5},
                {2, 3},
                {2, 4},
                {3, 5},
                {4, 5}
        };

        InnerGraph g = new InnerGraph();

        // graph is returned here
        List<List<Integer>> graph = g.makeGraph(V, edges);

        // graph can be reused anywhere
        g.printGraph(graph);
    }
}