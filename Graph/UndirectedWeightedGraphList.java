package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class UndirectedWeightedGraphList {
    public static void main(String[] args) {
        int vertices = 5;
        int edges = 6;
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<int[]>> li = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            li.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            li.get(u).add(new int[] { v, weight });
            li.get(v).add(new int[] { u, weight });
        }
        printGraph(li, vertices);
        sc.close();
    }

    static void printGraph(ArrayList<ArrayList<int[]>> li, int vertices) {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int items[] : li.get(i)) {
                System.out.print("{" + items[0] + ", " + items[1] + "} ");
            }
            System.out.println();
        }
    }
}
