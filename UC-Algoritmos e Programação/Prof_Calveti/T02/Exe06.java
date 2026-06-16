import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        double catetoA = scanner.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double catetoB = scanner.nextDouble();

        double hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

        System.out.println("Valor da hipotenusa: " + hipotenusa);

        scanner.close();
    }
}
