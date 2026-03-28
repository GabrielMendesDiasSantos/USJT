import java.util.Scanner;

public class Exercicio_01{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        String nome;
        System.out.print ("Qual o seu nome? ");
        nome = scanner.nextLine();

        int idade;
    
        System.out.print ("Qual a sua idade? ");
        idade = scanner.nextInt();

        Double altura;
        System.out.print ("Qual a sua altura? ");
        altura = scanner.nextDouble();

        System.out.println ("Seu nome é: " + nome + ".");
        System.out.println ("Você tem: " + idade + " anos.");
        System.out.println ("Você tem: " + altura + " de altura.");

        scanner.close();
    }
}