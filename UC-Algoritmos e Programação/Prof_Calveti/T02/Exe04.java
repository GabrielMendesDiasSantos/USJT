import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a potencia do aparelho em Watts: ");
        double potenciaWatts = scanner.nextDouble();

        System.out.print("Digite as horas de uso por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Digite o preco do KWh: R$ ");
        double precoKwh = scanner.nextDouble();

        double consumoMensalKwh = (potenciaWatts / 1000) * horasPorDia * 30;
        double custoMensal = consumoMensalKwh * precoKwh;

        System.out.printf("Custo mensal do aparelho: R$ %.2f%n", custoMensal);

        scanner.close();
    }
}
