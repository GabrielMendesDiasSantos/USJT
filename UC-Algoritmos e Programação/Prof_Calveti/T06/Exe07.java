import java.util.Scanner;
import java.util.Locale;

public class Exe07 {
    public static void main (String[] args){
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale(br);

        System.out.print("Digite o numero desejado da sequencia Fibonacci: ");
        int numero = sc.nextInt();
        double formula = 1.618033, formula2 = 0;
        int cont = 0;

        if (numero > 0)
        {
            while (cont != numero)
            {
                cont++;
                formula2++;
                double formula3 = Math.pow(formula, formula2) / 2.2360;
                System.out.printf ("\n%.0f", formula3);
            }
        }
        if (numero < 0)
        {
            System.out.println("Nao tem nunmeros negativos. Tente novamente.");
        }
        sc.close();
    }
    
}
