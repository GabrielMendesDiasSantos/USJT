import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalSecundaria = 0;

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();

                if (i + j == 2) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma da diagonal secundaria: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
