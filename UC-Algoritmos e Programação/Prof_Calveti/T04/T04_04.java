import java.util.Scanner;

public class T04_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         Double nota1, nota2;
        System.out.print("Coloque a primeira nota aqui: ");
        nota1 = scanner.nextDouble();
        System.out.print("Coloque a segunda nota aqui: ");
        nota2 = scanner.nextDouble();
        Double total = (nota1 + nota2) / 2;

        if(total >= 6.0)
        {
            System.out.println("APROVADO");
        }
        
        if(total < 6.0)
        {
            System.out.println("EXAME");
        }

        scanner.close();
    }
}
