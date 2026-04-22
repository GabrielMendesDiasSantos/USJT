import java.util.Scanner;
import java.util.Locale;

public class Exe03 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale (br);

        System.out.print ("Qual a quantidade atual do estoque? ");
        int a = sc.nextInt();
        System.out.print ("Qual a quantidade minima? ");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println ("\nEfetuar compra!");
        }
        else {
            System.out.println("\nEstoque OK.");
        }
    }
}