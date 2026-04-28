import java.util.Scanner;

public class Exe08 {
    public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);

    int numero;

        do {
            System.out.print ("Digite um numero inteiro: ");
            numero = sc.nextInt();
            if (numero < 1) {
                System.out.println ("Digite um numero maior que 0!");
            }
        }while (numero < 1);

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++){
            System.out.print (j);
            }
            System.out.println ("");
        }

    sc.close();
    }
}
