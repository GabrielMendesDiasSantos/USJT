import java.util.Locale;
import java.util.Scanner;

public class Exe09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale brasil = new Locale ("pt", "BR");

         System.out.print("Voce gostaria de converter:\n\nCelsius para Fahrenheit(Digite 1).\nFahrenheit para Celsius(Digite 2).\n\nSua escolha:");
         int graus = sc.nextInt();

         switch (graus)
         {
            case 1: System.out.print("\nDigite a quantidade de graus Celsius: ");
        Double celsius = sc.nextDouble();
        Double fahrenheit = (celsius * 1.8) + 32;
            System.out.printf(brasil, "%.0f°C = %.1f°F", celsius, fahrenheit);
            break;
            case 2: System.out.print("\nDigite a quantidade de graus Fahrenheit: ");
            Double fahrenheit2 = sc.nextDouble();
            Double celsius2 = (fahrenheit2 - 32) * 5 / 9;
            System.out.printf (brasil, "%.1f°F = %.0f°C", fahrenheit2, celsius2);
            break;
            default: System.out.println("Desculpa, parece que voce digitou errado. tente novamente.");
         }



        sc.close();
    }
}