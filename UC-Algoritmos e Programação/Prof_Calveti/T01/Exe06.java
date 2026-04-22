import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o raio do reservatório (em metros): ");
        double r = sc.nextDouble();

        System.out.print("Digite a altura do reservatório (em metros): ");
        double h = sc.nextDouble();

        // Cálculo do volume em m³
        double volumeM3 = Math.PI * Math.pow(r, 2) * h;

        // Conversão para litros
        double volumeLitros = volumeM3 * 1000;

        // Saída
        System.out.println("Volume do reservatório:");
        System.out.printf("%.2f m³%n", volumeM3);
        System.out.printf("%.2f litros%n", volumeLitros);

        sc.close();
    }
}