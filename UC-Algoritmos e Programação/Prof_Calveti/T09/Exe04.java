import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int menor = 0;
        int linhaMenor = 0;
        int colunaMenor = 0;

        System.out.println("Digite os valores da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();

                if (i == 0 && j == 0) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }

        System.out.println("\nMenor valor encontrado: " + menor);
        System.out.println("Linha: " + linhaMenor);
        System.out.println("Coluna: " + colunaMenor);

        scanner.close();
    }
}
