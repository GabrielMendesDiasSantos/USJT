import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];

        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os 5 elementos do vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        System.out.println("\nVetor C = A[i] * B[i]:");
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
            System.out.println("C[" + i + "] = " + c[i]);
        }

        scanner.close();
    }
}
