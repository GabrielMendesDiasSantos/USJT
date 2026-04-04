import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        String letra;
        System.out.print("Digite uma letra: ");
        letra = scanner.nextLine();
 
        switch (letra)
        {
            case "a", "e", "i", "o", "u": System.out.println("Esta letra e uma vogal!");
            break;
            case "q", "w", "r", "t", "y", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m":System.out.println("Esta letra e uma consoante!");
            break;
            default: System.out.println("Desculpa isso nao e uma letra (ou ela ta maiuscula). Tente novamente");
        }


        scanner.close();
    }
}
