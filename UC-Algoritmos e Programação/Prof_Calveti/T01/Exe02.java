import java.util.Scanner;
import java.util.Locale;

public class Exe02 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale (br);

        int r, i;

        System.out.print ("Qual a resistencia? ");
        r = sc.nextInt();
        System.out.print ("Qual o valor da corrente? ");
        i = sc.nextInt();

        int v = r * i;

        System.out.println ("Quantidade de Volts: " + v);

        sc.close();
    }
}