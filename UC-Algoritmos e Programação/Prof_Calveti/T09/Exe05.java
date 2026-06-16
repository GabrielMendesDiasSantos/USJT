import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[5][3];

        System.out.println("Digite as 3 notas de cada aluno:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Aluno " + (i + 1) + " - Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMedias dos alunos:");
        for (int i = 0; i < 5; i++) {
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }
            double media = soma / 3;
            System.out.printf("Aluno %d: %.2f%n", (i + 1), media);
        }

        scanner.close();
    }
}
