import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor disponivel em Reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.print("Digite a cotacao atual do dolar: ");
        double cotacaoDolar = scanner.nextDouble();

        double valorDolares = valorReais / cotacaoDolar;

        System.out.println("Valor convertido em Dolares (US$): " + valorDolares);

        scanner.close();
    }
}
