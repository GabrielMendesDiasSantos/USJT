import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a distância percorrida (km): ");
        double km = sc.nextDouble();

        System.out.print("Digite a quantidade de combustível consumida (litros): ");
        double litros = sc.nextDouble();

        // Cálculo do consumo médio
        double consumo = km / litros;

        // Saída
        System.out.println("Consumo médio: " + consumo + " km/l");

        sc.close();
    }
}