import java.util.Scanner;

public class Exe12 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o número de termos de precisão: ");
        int termos = sc.nextInt();

        int cont = 0;               // contador de termos
        double soma = 0.0;       // acumula a série
        int sinal = 1;           // alterna + e -

        while (cont < termos) {
            soma += sinal * (1.0 / (2 * cont + 1));
            sinal *= -1;         // troca o sinal
            cont++;
        }

        double piAproximado = 4 * soma;

        System.out.printf("Valor aproximado de pi com %d termos: %.10f\n", termos, piAproximado);
        System.out.printf("Valor de Math.PI: %.10f\n", Math.PI);



        sc.close();
    }
}
