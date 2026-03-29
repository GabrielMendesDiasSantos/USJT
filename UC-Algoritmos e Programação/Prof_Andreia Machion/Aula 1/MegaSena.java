public class MegaSena{
    public static void main(String[] args){

        Double ganhador1 = 46.0 / 100 * 780000.00;
        Double ganhador2 = 32 * 780000.00 / 100;
        Double ganhador3 = 780000.00 - ganhador1 - ganhador2;
        System.out.printf("Ganhador 1: %.2f\n Ganhador 2: %.2f\n Ganhador 3: %.2f\n", ganhador1, ganhador2, ganhador3);
    }
}