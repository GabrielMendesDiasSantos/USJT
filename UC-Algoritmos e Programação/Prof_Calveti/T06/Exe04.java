import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        if (n < 0)
        {
            System.out.println("\nAlgo deu errado! Voce nao pode colocar numeros negativos. Tente novamente");
        }
        else
        {
            while (n > 0)
            {
                System.out.print("\nSistema operando.T-menos " + n + " segundos;");
                --n;
            }
        }

        sc.close();
    }
}
