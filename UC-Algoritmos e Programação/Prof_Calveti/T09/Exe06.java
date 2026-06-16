import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] faturamento = new double[3][3];

        System.out.println("Digite os valores de faturamento da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Linha " + i + ", coluna " + j + ": R$ ");
                faturamento[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMedia de cada coluna:");
        for (int j = 0; j < 3; j++) {
            double soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += faturamento[i][j];
            }
            double media = soma / 3;
            System.out.printf("Coluna %d: %.2f%n", j, media);
        }

        scanner.close();
    }
}
