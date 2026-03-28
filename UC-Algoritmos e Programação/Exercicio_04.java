import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner  (System.in);


        //perguntando o valor.  

        Double reais;
        System.out.print ("Valor em Reais: ");
        reais = scanner.nextDouble();

        //Variavel com o valor da conversao.

        Double valorDolar;
        valorDolar = reais / 5;
        System.out.println ("Valor em Dolares: " + valorDolar);

        scanner.close();
    }
}