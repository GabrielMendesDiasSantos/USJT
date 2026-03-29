import java.util.Scanner;

public class T04_05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.print("Digite o numero aqui: ");
        numero = scanner.nextInt();

        if(numero % 3 == 0 && numero % 5 == 0)
        {
            System.out.println("Ele e multiplo de 3 e de 5.");
        }
        
        else
        {
            System.out.println("Ele nao e multiplo de 3 e de 5");
        }

        scanner.close();
    }
}