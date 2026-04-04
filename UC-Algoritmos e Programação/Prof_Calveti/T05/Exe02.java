import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double numero;
        System.out.print("Digite um numero: ");
        numero = scanner.nextDouble();

        if (numero > 0)
        {
            System.out.println("Este numero e positivo");
        }
        else if (numero < 0)
        {
            System.out.println("Este numero e negativo");
        }
        else
        {
            System.out.println("Este numero e zero");
        }
        scanner.close();
    }
}
