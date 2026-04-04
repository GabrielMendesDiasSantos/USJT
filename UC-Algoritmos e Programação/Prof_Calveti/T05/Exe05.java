import java.util.Locale;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale (new Locale ("pt", "BR"));

        Double n1, n2;
        System.out.print("Digite o primeiro numero: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite o simbolo de operacao desejado (sendo: +, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        switch (operador)
        {
            case '+': System.out.print("Otimo! Agora digite o segundo numero: ");
            n2 = scanner.nextDouble();
            Double soma = n1 + n2;
            System.out.printf (new Locale ("pt", "BR"),
            "RESPOSTA:\n%.2f + %.2f = %.2f", n1, n2, soma);
            break;

            case '-':System.out.print("Otimo! Agora digite o segundo numero: ");
            n2 = scanner.nextDouble();
            Double subtracao = n1 - n2;
            System.out.printf(new Locale ("pt", "BR"),
            "RESPOSTA:\n%.2f - %.2f = %.2f", n1, n2, subtracao);
            break;

            case '*':System.out.print("Otimo! Agora digite o segundo numero: ");
            n2 = scanner.nextDouble();
            Double multiplicacao = n1 * n2;
            System.out.printf(new Locale ("pt", "BR"),
        "RESPOSTA:\n%.2f * %.2f = %.2f", n1, n2, multiplicacao);
            break;

            case '/':System.out.print("Otimo! Agora digite o segundo numero: ");
            n2 = scanner.nextDouble();
            Double divisao = n1 / n2;
            System.out.printf(new Locale ("pt", "BR"),
        "RESPOSTA:\n%.2f / %.2f = %.2f", n1, n2, divisao);
            break;

            default: System.out.println("Desculpa, mas parece que voce digitou algo errado. tente novamente.");

        }
 

        scanner.close();
    }
}
