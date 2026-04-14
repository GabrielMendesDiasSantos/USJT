import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int quantidade = 1;

        while (quantidade <= 10)
        {
            int resultado = n * quantidade;
            if (resultado % 3 == 0)
            {
                System.out.println(n + " * " + quantidade + " = " + resultado);
            }
                ++quantidade;
        }

        sc.close();
    }
}