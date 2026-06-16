import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da base do silo em metros: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do silo em metros: ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume do silo: " + volume + " m3");

        scanner.close();
    }
}
