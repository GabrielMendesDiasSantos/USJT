import java.util.Locale;
import java.util.Scanner;

public class Exe10 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Locale br = new Locale ("pt", "BR");

        System.out.print("Digite a coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Digite  a coordenada Y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0){
            System.out.println("\nO ponto ta na origem.");
        }
        else if (x == 0){
            System.out.println("\nO ponto ta sobre o eixo X.");
        }
        else if (y == 0){
            System.out.println("\nO ponto ta sobre o eixo Y.");
        }
        else if (x > 0 && y > 0 ){
            System.out.println("\nO ponto ta no quadrante I.");
        }
        else if (x > 0 && y < 0){
            System.out.println("\nO ponto ta no quadrante II.");
        }
        else if (x < 0 && y < 0){
            System.out.println("\nO ponto ta no quadrante III.");
        }
        else {
            System.out.println("\nO ponto ta no quadrante IV.");
        }
        
        sc.close();
    }
}
