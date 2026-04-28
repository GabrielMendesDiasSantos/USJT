import java.util.Scanner;
import java.util.Locale;

public class Exe02 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale (br);

        double nota1, nota2;
        do {
            System.out.print ("Qual a primeira nota do aluno: ");
            nota1 = sc.nextDouble();
            System.out.print ("Qual a segunda nota do aluno: ");
            nota2 = sc.nextDouble();
            if (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
                System.out.println ("\nNao se pode ter nota negativa ou acima de 10.");
            }
        } while (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10);

        for (int i = 5; i <= 1; i--) {
            System.out.print ("\nProcessando... " + i + "s");
        }
        double notaFinal = (nota1 + nota2) / 2;
        System.out.printf ("\nA media deste aluno e: %.1f", notaFinal);

        sc.close();
    }
    
}