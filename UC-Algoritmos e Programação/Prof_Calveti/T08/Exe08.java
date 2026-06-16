import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[15];
        double maior = 0;
        double menor = 0;

        System.out.println("Digite 15 numeros reais:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();

            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
        }

        System.out.println("\nValores lidos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("v[" + i + "] = " + numeros[i]);
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
