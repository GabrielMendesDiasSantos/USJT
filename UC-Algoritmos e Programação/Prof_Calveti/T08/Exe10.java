import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("v[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        int ultimo = vetor[vetor.length - 1];
        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = ultimo;

        System.out.println("\nVetor rotacionado para a direita:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("v[" + i + "] = " + vetor[i]);
        }

        scanner.close();
    }
}
