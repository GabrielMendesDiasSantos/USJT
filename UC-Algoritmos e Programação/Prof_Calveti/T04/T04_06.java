import java.util.Scanner;

public class T04_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade, anoAtual;
        System.out.print("Coloque o ano do seu nascimento (AAAA): ");
        idade = scanner.nextInt();
        System.out.print("Coloque o ano atual (AAAA): ");
        anoAtual = scanner.nextInt();

        if(anoAtual - idade >= 18)
        {
            System.out.println("Voce tem idade para dirigir e votar!");
        }
        else if(anoAtual - idade >= 16)
        {
            System.out.println("Voce tem idade para votar!");
        }
        else
        {
            System.out.println("Voce nao pode votar e nem dirigir!");
        }

        scanner.close();
    }
}
