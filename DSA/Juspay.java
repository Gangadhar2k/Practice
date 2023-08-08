package DSA;

import java.util.Scanner;

public class Juspay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Number of cells
            int[] edge = new int[n];

            for (int i = 0; i < n; i++) {
                edge[i] = scanner.nextInt();
            }

            int[] weight = new int[n];

            for (int i = 0; i < n; i++) {
                if (edge[i] != -1) {
                    weight[edge[i]] += i; // Calculate weights
                }
            }

            int maxWeightNode = 0;
            int maxWeight = 0;

            for (int i = 0; i < n; i++) {
                if (weight[i] > maxWeight) {
                    maxWeight = weight[i];
                    maxWeightNode = i;
                }
            }

            System.out.println(maxWeightNode);
        }

        scanner.close();
    }
}
