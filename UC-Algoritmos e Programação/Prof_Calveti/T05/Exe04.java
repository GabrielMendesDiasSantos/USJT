import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        Double preco;
        System.out.print("Digite o preco do produto: ");
        preco = scanner.nextDouble();

        if (preco <= 50)
        {
            System.out.println("Esta barato!");
        }
        else if (preco <= 100)
        {
            System.out.println("Esta mediano!");
        }
        else
        {
            System.out.println("Esta caro!");
        }

        scanner.close();
    }
}
