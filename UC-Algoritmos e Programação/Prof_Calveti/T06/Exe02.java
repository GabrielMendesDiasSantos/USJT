import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("digite um numero inteiro: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero inteiro: ");
        int b = sc.nextInt();   
        if (a < b)
        {
           int inicio = a, fim = b;
           while (++inicio < fim)
           {
            System.out.println(inicio);
           }
        }
        else
        {
            int inicio = b, fim = a;
            while (++inicio < fim)
            {
                System.out.println(inicio);
            }
        }
        sc.close();
    }
}