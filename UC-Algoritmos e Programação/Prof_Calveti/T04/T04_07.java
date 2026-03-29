import java.util.Scanner;

public class T04_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double lado1, lado2, lado3;
        System.out.print("Coloque o valor do lado a: ");
        lado1 = scanner.nextDouble();
        System.out.print("Coloque o valor do lado b: ");
        lado2 = scanner.nextDouble();
        System.out.print("Coloque o valor do lado c: ");
        lado3 = scanner.nextDouble();

        if(lado1 + lado2 > lado3)
        {
            System.out.println("Ele pode formar um triangulo!");
        }
        else
        {
            System.out.print("ele nao pode formar um triangulo!");
        }

        scanner.close();
    }
}
