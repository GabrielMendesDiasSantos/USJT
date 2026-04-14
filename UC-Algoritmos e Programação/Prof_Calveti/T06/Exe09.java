import java.util.Scanner;
import java.util.Locale;

public class Exe09 {
    public static void main (String[] args){
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale (br);

        System.out.print ("Digite a base: ");
        double base = sc.nextDouble();
        
        System.out.print ("Digite o numero: ");
        double numero = sc.nextDouble();

        int cont = 0;

        if (base <= 1 || numero < 0)
        {
            System.out.println ("Valor invalido!");
        }
        else
        {
            while (numero > 1)
            {
                numero /= base;
                cont++;
            }
            System.out.println ("Dividiu " + cont + " vezes");
        }


        sc.close();
    }
}