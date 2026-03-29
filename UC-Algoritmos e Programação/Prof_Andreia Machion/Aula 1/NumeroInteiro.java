import java.util.Scanner;

public class NumeroInteiro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int inteiro, antecessor, sucessor;
        System.out.print("Coloque o numero inteiro: ");
        inteiro = scanner.nextInt();

        antecessor = 2 * inteiro - 1;
        sucessor = 3 * inteiro + 1;
//acho que ta tudo errado. Fazer de novo...
        System.out.println("resultado: " + (sucessor + antecessor));

        scanner.close();  
    }
}