import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da praca circular em metros: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite o valor do metro quadrado do piso: R$ ");
        double valorMetroQuadrado = scanner.nextDouble();

        double areaTotal = Math.PI * Math.pow(raio, 2);
        double custoTotal = areaTotal * valorMetroQuadrado;

        System.out.println("Area total da praca: " + areaTotal + " m2");
        System.out.println("Custo total do material: R$ " + custoTotal);

        scanner.close();
    }
}
