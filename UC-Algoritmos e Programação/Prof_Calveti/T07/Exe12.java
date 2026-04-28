import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
            if (numero >= 1) {
                System.out.println ("Digite um numero maior que 1.");
            }
        }while (numero <= 1);

        System.out.println("Fatoração em primos de " + numero + ":");

        do {
            int divisor = 2;
            for (; divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    break;
                }
            }

            System.out.println("Divisor primo encontrado: " + divisor);

            numero /= divisor;

        } while (numero > 1);

        sc.close();
    }
}
