import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int quantidade = 0;

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o numero X para pesquisar: ");
        int x = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == x) {
                quantidade++;
            }
        }

        System.out.println("O numero " + x + " aparece " + quantidade + " vez(es) no vetor.");

        scanner.close();
    }
}
