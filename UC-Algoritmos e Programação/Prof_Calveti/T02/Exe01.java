import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida em km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo gasto em horas: ");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.println("Velocidade media: " + velocidadeMedia + " km/h");

        scanner.close();
    }
}
