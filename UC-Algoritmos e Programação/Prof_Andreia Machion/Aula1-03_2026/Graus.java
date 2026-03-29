import java.util.Scanner;

public class Graus{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double radianos, graus;
        System.out.print("Qual o valor do angulo? ");
        graus = scanner.nextDouble();
//processamento de radianos.
        radianos = graus * (Math.PI / 180);
        System.out.printf("%.2f° = %.3f radianos\n", graus, radianos);

        scanner.close();
    }
}