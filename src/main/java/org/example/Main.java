package org.example;
import java.util.Scanner;

public class Main {
    public static void printArestas(int[][] matrizAdj) {
        int n = matrizAdj.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrizAdj[i][j] > 0) {
                    System.out.println("(" + i + ", " + j + ") - Peso: " + matrizAdj[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de vértices (n): ");
        int n = scanner.nextInt();

        // Leitura da matriz de adjacências
        int[][] matrizAdj = new int[n][n];
        System.out.println("Digite a matriz de adjacências (separando os elementos por espaço):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAdj[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nArestas do grafo com seus pesos:");
        printArestas(matrizAdj);
    }
}
