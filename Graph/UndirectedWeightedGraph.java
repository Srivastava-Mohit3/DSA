package Graph;

import java.util.Scanner;

public class UndirectedWeightedGraph {
    public static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nodes = 5;
        int edges = 6;
        int matrix[][] = new int[nodes][nodes];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            matrix[u][v] = weight;
            matrix[v][u] = weight;
        }
        printMatrix(matrix);
        sc.close();
    }
}
