import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[2][4];
        double soma = 0;

        System.out.println("Digite os valores da matriz 2x4:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextDouble();
                soma += matriz[i][j];
            }
        }

        System.out.println("\nSomatorio geral: " + soma);

        scanner.close();
    }
}
