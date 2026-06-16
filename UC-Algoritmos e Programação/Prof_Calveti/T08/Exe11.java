import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double[] pesos = new double[5];
        double somaPonderada = 0;
        double somaPesos = 0;

        System.out.println("Digite as 5 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\nDigite os 5 pesos:");
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        if (somaPesos == 0) {
            System.out.println("Nao e possivel calcular a media com soma de pesos igual a zero.");
        } else {
            double mediaPonderada = somaPonderada / somaPesos;
            System.out.printf("Media ponderada final: %.2f%n", mediaPonderada);
        }

        scanner.close();
    }
}
