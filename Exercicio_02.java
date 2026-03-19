import java.util.Scanner;

public class Exercicio_02{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        Double medida;
        System.out.print ("Qual a medida do lado do quadrado? ");
        medida = scanner.nextDouble();

        System.out.println ("A área deste quadrado é: " + Math.pow (medida, 2));

        scanner.close();
    }
}