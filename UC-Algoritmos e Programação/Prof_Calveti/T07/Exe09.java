import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        do {
            System.out.print("Digite a base A (inteiro): ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.next(); 
            }
            A = sc.nextInt();
        } while (false);
        do {
            System.out.print("Digite o expoente B (inteiro positivo): ");
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número inteiro positivo.");
                sc.next();
            }
            B = sc.nextInt();
            if (B < 0) {
                System.out.println("Expoente inválido! Deve ser positivo.");
            }
        } while (B < 0);
        int resultado = 1;
        for (int i = 1; i <= B; i++) {
            resultado *= A;
        }
        System.out.println(A + "^" + B + " = " + resultado);
        sc.close();
    }
}