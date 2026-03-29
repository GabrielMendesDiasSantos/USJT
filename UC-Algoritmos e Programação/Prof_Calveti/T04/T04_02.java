import java.util.Scanner;

public class T04_02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int idade;
        System.out.print("Coloque a idade do nadador: ");
        idade = scanner.nextInt();

        if(idade >= 18)
        {
            System.out.println("Este nadador e da categoria adulta!");
        }

        else
        {
            System.out.println("Este nadador nao e da categoria adulta!");
        }
        

        scanner.close();
    }
}