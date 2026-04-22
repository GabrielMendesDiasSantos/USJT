import java.util.Scanner;
import java.util.Locale;

public class Exe01 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale (br);

double volume, consumo;
        do {
            System.out.print ("Qual o volume total de concreto: ");
            volume = sc.nextDouble();
            System.out.print ("Qual o traço de cimento por M\u00B3: ");
            consumo = sc.nextDouble();
            if (volume <= 0 || consumo <= 0) {
                System.out.println ("Valor invalido! Tente novamente.");
            }
        } while (volume <= 0 || consumo <= 0); 

        double valorTotal = volume * consumo;
        double sacos = valorTotal / 50;
        System.out.printf ("\nSerao necessarios %.0f sacos de cimento.", sacos);


        sc.close();
    }
}