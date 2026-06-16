import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] valvulas = new boolean[3][3];
        boolean existeAlerta = false;

        System.out.println("Digite o estado das valvulas hidraulicas:");
        System.out.println("Use true para ligada/aberta e false para desligada/fechada.");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valvula da linha " + i + ", coluna " + j + ": ");
                valvulas[i][j] = scanner.nextBoolean();
            }
        }

        for (int i = 0; i < 3; i++) {
            boolean linhaTodaFalse = true;
            for (int j = 0; j < 3; j++) {
                if (valvulas[i][j]) {
                    linhaTodaFalse = false;
                    break;
                }
            }

            if (linhaTodaFalse) {
                existeAlerta = true;
                break;
            }
        }

        if (existeAlerta) {
            System.out.println("ALERTA");
        } else {
            System.out.println("Sistema normal");
        }

        scanner.close();
    }
}
