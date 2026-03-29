import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double nota1;
        System.out.print ("Valor da primeira nota: ");
        nota1 = scanner.nextDouble();

        Double nota2;
        System.out.print ("Valor da segunda nota: ");
        nota2 = scanner.nextDouble();

        Double nota3;
        System.out.print ("Valor da terceira nota: ");
        nota3 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3) / 3;
        System.out.println ("A sua média é: " + media);

        scanner.close();
    }
}