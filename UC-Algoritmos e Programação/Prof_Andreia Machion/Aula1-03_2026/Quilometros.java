import java.util.Scanner;

public class Quilometros{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double quilometros, milhas;
        System.out.print("Coloque o valor em quilometros: ");
        quilometros = scanner.nextDouble();

        milhas = quilometros / 1.61;
        System.out.printf("%.2f km = %.2f milhas\n", quilometros, milhas);

        scanner.close();
    }
}