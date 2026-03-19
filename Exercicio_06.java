import java.util.Scanner;

public class Exercicio_06{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //ver os esegundos.

        int segundos;
        System.out.print("Digite os segundo: ");
        segundos = scanner.nextInt();

        //cauculando as horas.

        int valorHoras = segundos / 3600;

        //cauculando minutos.

        int valorMinutos = (segundos % 3600) / 60;

        //cauculando os segundos.

        int valorSegundos = segundos % 60;

        //passando pro terminal em texto.

        System.out.print("Total = " + valorHoras + "h " + valorMinutos + "m " + valorSegundos + "s ");

        scanner.close();
    }
}