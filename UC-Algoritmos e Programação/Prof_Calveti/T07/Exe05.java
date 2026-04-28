import java.util.Scanner;
import java.util.Locale;

public class Exe05 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");            //Criando as classes Locale e o Scanner.
        Scanner sc = new Scanner (System.in).useLocale (br);

        double[] n = new double[10];                                       //Declarando as variaveis.
        int cont = 0, j = 0, p = 0;                                               //Declarando o array.

        while (cont < 10) {
            System.out.print ("Digite um numero: ");                    //Lendo os numeros dos usuarios (ate 10).
            n[cont] = sc.nextDouble();
            cont++;
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 10 && n[i] < 20) {
                j++;
            }
            if (n[i] <= 10 || n[i] >= 20) {;
                p++;
            }
        }
        System.out.printf ("\nVoce tem %d numeros dentro do intervalo 10-20.", j);
        System.out.printf ("\nVoce tem %d numeros fora do intervalo de 10-20.", p);


        sc.close();
    }
}
