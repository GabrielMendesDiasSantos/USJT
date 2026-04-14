import java.util.Scanner;
import java.util.Locale;
public class Exe06{
    public static void main (String[] args){
        Locale brasil = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale(brasil);
        System.out.print("Digite a primeira altura: ");
        double altura = sc.nextDouble(); 
        double soma = 0, maiorAlt = altura, menorAlt = altura;
        int cont = 1;
        while (cont < 10){
            if (altura >= 0)
            {
            System.out.print("Digite as demais alturas: ");
            altura = sc.nextDouble();
            }
            if (altura >= 0 || maiorAlt < altura){          //decide qual a maior altura.
                maiorAlt = altura;
            }
            if (altura >= 0 || menorAlt > altura){         //decide a menor altura.
                menorAlt = altura;
            }
            soma += altura;                //acumulador.
            cont++;                        //contador.
        }
        if (altura >= 0){
        double media = soma / cont;         //media.
        System.out.printf(brasil,"\nMaior altura = %.2f", maiorAlt);
        System.out.printf(brasil,"\nMedia = %.2f", media);
        System.out.printf(brasil, "\nMenor altura = %.2f", menorAlt);
        }
        if (altura < 0){
            System.out.println ("Nao tem como colocar um altura negativa!");
        }
        sc.close();
    }
}