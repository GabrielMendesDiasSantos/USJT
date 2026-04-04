import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 10)
        {
            System.out.println("Este nadador esta na divisao Infantil!");
        }
        else if (idade > 10 && idade <= 17)
        {
            System.out.println("Este nadador esta na divisao Juvenil!");
        }
        else if (idade >= 18)
        {
            System.out.println("Este nadador esta na divisao Sênior!");
        }
        else
        {
            System.out.println("Desculpa! Este nadador nao passou da idade de corte(5 anos).");
        }

        scanner.close();
    }
}
