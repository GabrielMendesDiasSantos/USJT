import java.util.Scanner;

public class Exe04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int n, j = 0;
        String opcao;

        do {
            do {
                System.out.print ("Digite um numero inteiro maior que 1: ");
                n = sc.nextInt();
                if (n <= 1) {
                    System.out.println ("Parece que voce digitou errado! Tente novamente.");
                }
                sc.nextLine();
            }while (n <= 1);

            for (int i = 0; i < n; i += 2) {
                j += i;
            }

            System.out.println ("\nSoma = " + j);
            j = 0;

            System.out.print ("Voce deseja repetir o calculo para outro intervalo? ");
            opcao = sc.nextLine().toUpperCase();
            if (opcao.equals ("NAO") || opcao.equals ("NÃO")) {
                System.out.print ("OK. Tenha um otimo dia!");
            }

        }while (opcao.equalsIgnoreCase ("SIM"));

        sc.close();
        }
}