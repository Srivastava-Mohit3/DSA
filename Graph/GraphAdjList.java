package Graph;

import java.util.*;

public class GraphAdjList {
    static class InnerGraph {
        List<List<Integer>> adjList;

        public void makeGraph(int V, int edges[][]) {
            adjList = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adjList.add(new ArrayList<>());
            }
            for (int edge[] : edges) {
                int u = edge[0] - 1;
                int v = edge[1] - 1;
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }

        public void printGraph() {
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
        int edges[][] = {
                { 1, 3 },
                { 1, 2 },
                { 1, 5 },
                { 2, 3 },
                { 2, 4 },
                { 3, 5 },
                { 4, 5 }
        };
        InnerGraph g = new InnerGraph();
        g.makeGraph(V, edges);
        g.printGraph();
    }
}
