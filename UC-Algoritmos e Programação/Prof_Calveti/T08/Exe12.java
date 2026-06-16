import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] original = new int[10];
        int quantidadeNaoRepetidos = 0;

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            original[i] = scanner.nextInt();
        }

        for (int i = 0; i < original.length; i++) {
            int ocorrencias = 0;
            for (int j = 0; j < original.length; j++) {
                if (original[i] == original[j]) {
                    ocorrencias++;
                }
            }

            if (ocorrencias == 1) {
                quantidadeNaoRepetidos++;
            }
        }

        int[] naoRepetidos = new int[quantidadeNaoRepetidos];
        int posicao = 0;

        for (int i = 0; i < original.length; i++) {
            int ocorrencias = 0;
            for (int j = 0; j < original.length; j++) {
                if (original[i] == original[j]) {
                    ocorrencias++;
                }
            }

            if (ocorrencias == 1) {
                naoRepetidos[posicao] = original[i];
                posicao++;
            }
        }

        System.out.println("\nVetor com numeros que nao se repetem:");
        for (int i = 0; i < naoRepetidos.length; i++) {
            System.out.println("naoRepetidos[" + i + "] = " + naoRepetidos[i]);
        }

        scanner.close();
    }
}
