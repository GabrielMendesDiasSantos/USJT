import java.util.Scanner;

public class Exe05{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int senha = 512008;
        int contador = 0, tentativa, tentativasRestantes = 3;

        System.out.print("Digite a senha: ");
        tentativa = sc.nextInt();

        if (tentativa != senha)
        {
        while (contador < 3 && tentativa != senha)
        {
                System.out.println("\nSenha incorreta! Tente novamente" + "(" + tentativasRestantes + " tentativas): ");
                tentativa = sc.nextInt();
                contador++;
                tentativasRestantes--;
        }
        }
        if (tentativa == senha)
        {
            System.out.print("Acesso permitido!");
        }
        if (contador == 3)
        {
            System.out.print("\nTerminal bloqueado!");
        }

        sc.close();
    }
}