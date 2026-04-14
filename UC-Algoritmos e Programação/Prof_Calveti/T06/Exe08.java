import java.util.Scanner;
import java.util.Locale;

public class Exe08 {
    public static void main (String[] args){
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in). useLocale(br);

        System.out.printf(br, "Informe o valor inicial em Kelvin: ");
        double inicio = sc.nextDouble();

        System.out.print("Informe o valor final em Kelvin: ");
        double fim = sc.nextDouble();

        System.out.print("Informe o passo (incremento): ");
        double passo = sc.nextDouble();

        System.out.println("\nTabela de Conversão Kelvin para Celsius");
        System.out.println("---------------------------------------");
        System.out.printf(br, "%10s %5s %10s\n", "Kelvin", "-", "Celsius"); //O %s serve para String.
                                                                                            //O %f serve para numeros decimais.
        double atual = inicio;                                                              //O %d serve para numeros inteiros.
        while (atual < fim)
        {
            double celsius = atual - 273.15;
            System.out.printf(br, "\n%10.2f %5s %10.2f\n", atual, "=", celsius);    
            atual += passo;
        }
        double celsius = fim - 273.15;
        System.out.printf(br, "\n%10.2f %5s %10.2f\n", fim, "=", celsius);

        sc.close();
    }
}