import java.util.Locale;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        System.out.print("Digite o seu peso em Kg: ");
        Double peso = sc.nextDouble();
        System.out.print("Digite a sua altura em Metros: ");
        Double altura = sc.nextDouble();
        Double imc = peso / (altura * altura);

        if (imc < 18.5)
        {
            System.out.printf (new Locale ("pt", "BR"),
            "Seu IMC e %.1f: Voce esta abaixo do peso!", imc);
        }
        else if (imc >= 18.5 && imc < 25)
        {
            System.out.printf (new Locale ("pt", "BR"),
            "Seu IMC e %.1f: Seu peso e normal!", imc);
        }
        else if (imc >= 25 && imc < 30)
        {
            System.out.printf (new Locale ("pt", "BR"),
        "Seu IMC e %.1f: Voce esta sobrepeso!", imc);
        }
        else if (imc >= 30 && imc < 35)
        {
            System.out.printf (new Locale ("pt", "BR"),
        "Seu IMC %.1f: Voce esta na obesidade I!", imc);
        }
        else if (imc >= 35 && imc < 40)
        {
            System.out.printf (new Locale ("pt", "BR"),
        "Seu IMC %.1f: Voce esta na obesidade II(Severa)!", imc);
        }
        else
        {
            System.out.printf (new Locale ("pt", "BR"),
        "Seu IMC %.1f: Voce esta na obesidade III(Morbida)!", imc);
        }

        sc.close();
    }
}