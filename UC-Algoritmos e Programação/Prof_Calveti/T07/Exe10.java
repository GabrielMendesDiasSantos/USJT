public class Exe10 {
    public static void main(String[] args) {
        int tamanho = 5;

        System.out.println("Tabela de Estresse (S = x^2 + y^2):");
        System.out.print("y\\x\t");
        for (int x = 1; x <= tamanho; x++) {
            System.out.print(x + "\t");
        }
        System.out.println();

        for (int y = 1; y <= tamanho; y++) {
            System.out.print(y + "\t");
            for (int x = 1; x <= tamanho; x++) {
                int S = (x * x) + (y * y);
                System.out.print(S + "\t");
            }
            System.out.println();
        }
    }
}
