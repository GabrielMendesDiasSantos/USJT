import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        double[][] resultado = new double[3][3];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("\nDigite o fator escalar: ");
        double fator = scanner.nextDouble();

        System.out.println("\nMatriz multiplicada pelo fator escalar:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz[i][j] * fator;
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
