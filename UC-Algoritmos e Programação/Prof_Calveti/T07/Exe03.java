import java.util.Scanner;

public class Exe03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int n;
        do {
            System.out.print ("\nDigite um numero inteiro: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println ("\nDigite um numero acima de 0!");
            }
        }while (n <= 0);

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b < n; b++) {
                System.out.print ("*");
            }
            System.out.println ("*");
        }

        sc.close();
    }
}
