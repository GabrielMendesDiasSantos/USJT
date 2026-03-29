import java.util.Scanner;

public class T04_01{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        int n;
        System.out.print("coloque um numero inteiro: ");
        n = scanner.nextInt();

        if(n >= 0)
        {
            System.out.println("este numero e positivo!");
        }
        else
        {
            System.out.println("este numero e negativo!");
        }
        
        scanner.close();
    }
}