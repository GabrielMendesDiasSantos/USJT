import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = sc.nextDouble();

        // Conversão para Celsius
        double c = (f - 32) * 5 / 9;

        // Saída
        System.out.printf("Temperatura em Celsius: %.2f °C%n", c);

        sc.close();
    }
}