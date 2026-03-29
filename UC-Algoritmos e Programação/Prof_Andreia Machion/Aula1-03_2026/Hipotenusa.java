import java.util.Scanner;

public class Hipotenusa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double a, b, aQuad, bQuad, hipotenusa;

        System.out.print("Digite o cateto a: ");
        a = scanner.nextDouble();
        System.out.print("Digite o cateto b; ");
        b = scanner.nextDouble();
        aQuad = Math.pow (a, 2);
        bQuad = Math.pow (b, 2);
        hipotenusa = Math.sqrt (aQuad + bQuad);
        System.out.printf("hipotenusa = %.2f\n", hipotenusa);

        scanner.close();
    }
}