public class Exe03 {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, -4, 7},
            {-2, 0, 15},
            {8, -9, -1},
            {3, 6, -12}
        };

        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > 0) {
                    positivos++;
                } else if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println("Quantidade de numeros positivos: " + positivos);
        System.out.println("Quantidade de numeros negativos: " + negativos);
    }
}
