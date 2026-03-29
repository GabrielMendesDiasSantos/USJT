import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double peso;
        System.out.print("Qual o peso? ");
        peso = scanner.nextDouble();

        Double altura;
        System.out.print("Qual a altura? ");
        altura = scanner.nextDouble();;

        double imc = peso / (altura * altura);
        System.out.print("Valor do IMC: " + imc);

        scanner.close();
    }
}