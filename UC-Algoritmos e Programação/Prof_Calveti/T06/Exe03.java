import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("DIgite a temperatura (999 p/ parar programa): ");
        int temperatura = sc.nextInt();
        int quantidade = 0;
        int soma = 0;

            while (temperatura != 999)
            {
                soma += temperatura;       //acumulador
                quantidade++;             //contador
                System.out.print("Digite a proxima temperatura (999 p/ parar o programa): ");
                temperatura = sc.nextInt();
            }
            if (quantidade > 0)
            {
                int media = soma / quantidade;
                System.out.println("Media das temperaturas: " + media);
            }
            else
            {
                System.out.println("Nao teve nenhuma temperatura para caucular.");
            }


            sc.close();
        }
    }