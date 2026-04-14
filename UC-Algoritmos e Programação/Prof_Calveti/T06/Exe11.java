import java.util.Scanner;

public class Exe11 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o numero inteiro: ");
        int numero = sc.nextInt();
        int divisor = 1;
        int cont = 0;
        
        while (divisor <= numero)
        {
            if (numero % divisor == 0)
            {
                cont++;
            }
            divisor++;
        }
        if (cont == 2)
        {
            System.out.printf ("\no numero %d e primo!\n", numero);
        }
        else
        {
            System.out.printf ("\n o numero %d nao e primo.\n", numero);
        }

        sc.close();
    }
}
