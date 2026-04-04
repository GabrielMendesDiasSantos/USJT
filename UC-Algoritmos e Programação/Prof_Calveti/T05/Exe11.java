import java.util.Locale;
import java.util.Scanner;

public class Exe11 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Locale br = new Locale ("pt", "BR");

        System.out.print("Digite o preço inteiro: ");
        int preco = sc.nextInt();

        if (preco >= 100){
            int n100 = preco / 100;
            System.out.println("Nota(s) de R$100: " + n100);
            preco %= 100;
        }
        if (preco >= 50){
            int n50 = preco / 50;
            System.out.println("Nota(s) de R$50: " + n50);
            preco %= 50;
        }
        if (preco >= 20){
            int n20 = preco / 20;
            System.out.println("Nota(s) de R$20: " + n20);
            preco %= 20;
        }
        if (preco >= 10){
            int n10 = preco / 10;
            System.out.println("Nota(s) de R$10: " + n10);
            preco %= 10;
        }
        if (preco >= 5){
            int n5 = preco / 5;
            System.out.println("Nota(s) de R$5: " + n5);
            preco %= 5;
        }
        if (preco >= 2){
            int n2 = preco / 2;
            System.out.println("Nota(s) de R$2: " + n2);
            preco %= 2;
        }
        if (preco >= 1){
            int n1 = preco / 1;
            System.out.println("Moeda(s) de R$1: " + 1);
            preco %= 1;
        }

        sc.close ();
    }
}
