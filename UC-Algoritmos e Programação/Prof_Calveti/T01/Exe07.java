import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Código mestre
        int codigoMestre = 1234;

        // Entrada de dados
        System.out.print("Digite o código de acesso: ");
        int codigoDigitado = sc.nextInt();

        // Validação
        if (codigoDigitado == codigoMestre) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        sc.close();
    }
}