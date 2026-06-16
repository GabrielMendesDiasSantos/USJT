import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores positivos digitados:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
