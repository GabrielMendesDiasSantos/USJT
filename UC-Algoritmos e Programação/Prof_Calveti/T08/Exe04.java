public class Exe04 {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * i;
        }

        System.out.println("Vetor com o quadrado de cada indice:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("v[" + i + "] = " + vetor[i]);
        }
    }
}
