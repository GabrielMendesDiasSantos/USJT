import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String senhaCorreta = "1234"; // senha definida
        boolean acessoConcedido = false;
        // Usuário tem 3 tentativas
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            String senhaDigitada;
            // Validação: senha deve ter exatamente 4 dígitos
            do {
                System.out.print("Digite a senha (4 dígitos): ");
                senhaDigitada = sc.nextLine();
                if (senhaDigitada.length() != 4) {
                    System.out.println("Senha inválida! Deve ter exatamente 4 dígitos.");
                }
            } while (senhaDigitada.length() != 4);
            // Verificação da senha
            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                acessoConcedido = true;
                break; // sai do laço for
            } else {
                System.out.println("Senha incorreta. Tentativa " + tentativa + " de 3.");
            }
        }
        if (!acessoConcedido) {
            System.out.println("Acesso bloqueado. Número máximo de tentativas atingido.");
        }
        sc.close();
    }
}
