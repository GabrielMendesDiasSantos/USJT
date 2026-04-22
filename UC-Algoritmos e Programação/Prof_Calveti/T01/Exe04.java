import java.util.Scanner;
import java.util.Locale;

public class Exe04 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in);

        System.out.print ("Qual o capital inicial? ");
        double c = sc.nextDouble();
        System.out.print ("Qual a taxa de juros em % mensal? ");
        double j = sc.nextDouble();
        System.out.print ("Qual a quantidade de meses? ");
        double t = sc.nextDouble();
        j /= 100;

        Double m = c + (c * j * t);
        System.out.printf ("\nO montante final é: %.2f", m);

        sc.close();
    }
}