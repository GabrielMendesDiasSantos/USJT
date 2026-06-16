import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;
        int acimaDaMedia = 0;

        System.out.println("Digite as notas de 10 alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.printf("\nMedia da turma: %.2f%n", media);
        System.out.println("Alunos acima da media: " + acimaDaMedia);

        scanner.close();
    }
}
