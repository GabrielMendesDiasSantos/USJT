import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] materiais = new String[5];

        System.out.println("Digite o nome de 5 materiais:");
        for (int i = 0; i < materiais.length; i++) {
            System.out.print("Material " + (i + 1) + ": ");
            materiais[i] = scanner.nextLine();
        }

        System.out.println("\nMateriais digitados:");
        for (int i = 0; i < materiais.length; i++) {
            System.out.println((i + 1) + " - " + materiais[i]);
        }

        scanner.close();
    }
}
