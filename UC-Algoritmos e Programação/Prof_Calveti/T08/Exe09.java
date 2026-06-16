import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os 10 elementos do vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }

        System.out.println("\nVetor C intercalado:");
        for (int i = 0; i < c.length; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }

        scanner.close();
    }
}
