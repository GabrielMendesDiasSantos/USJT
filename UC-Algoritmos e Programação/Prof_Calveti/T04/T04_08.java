import java.util.Scanner;

public class T04_08 {
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        Double n1, n2, n3;
        System.out.print("Coloque o primeiro numero: ");
        n1 = scanner.nextDouble();
        System.out.print("Coloque o segundo numero: ");
        n2 = scanner.nextDouble();
        System.out.print("Coloque o terceiro numero: ");
        n3 = scanner.nextDouble();

       if(n1 <= n2 && n2 <= n3)
       {
        System.out.println("Segue os numeros em ordem crescente: " + n1 + ", " + n2 + ", " + n3);
       }
       else if(n1 <= n3 && n3 <= n2)
       {
        System.out.println("Segue os numeros em ordem crescente: " + n1 + ", " + n3 + ", " + n2);
       }
      else if(n2 <= n1 && n1 <= n3)
      {
        System.out.println("Segue os numeors em ordem crescente: " + n2 + ", " + n1 + ", " + n3);
      }
      else if(n2 <= n3 && n3 <= n1)
      {
        System.out.println("Segue os numeors em ordem crescente: " + n2 + ", " + n3 + ", " + n1);
      }
      else if(n3 <= n2 && n2 <= n1)
      {
        System.out.println("Segue os numeros em oredem crescente: " + n3 + ", " + n2 + ", " + n1);
      }
      else if(n3 <= n1 && n1 <= n2)
      {
        System.out.println("Segue os numeors em ordem crescente: " + n3 + ", " + n1 + ", " + n2);
      }

        scanner.close();
    }
}
