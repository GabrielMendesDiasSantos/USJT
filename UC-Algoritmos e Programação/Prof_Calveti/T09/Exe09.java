import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrizA = new double[2][3];
        double[][] matrizB = new double[2][3];
        double[][] matrizC = new double[2][3];

        System.out.println("Digite os valores da matriz A 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nDigite os valores da matriz B 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextDouble();
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nMatriz C = A + B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
