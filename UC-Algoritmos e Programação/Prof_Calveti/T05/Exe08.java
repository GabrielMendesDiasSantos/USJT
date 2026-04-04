import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Em que ano voce nasceu? ");
        int ano = sc.nextInt();


        if (ano >= 2001)
        {
            System.out.println("Voce nasceu no seculo XXI.");
        }
        else if (ano >= 1901)
        {
            System.out.println("Voce e do seculo XX.");
        }
        else
        {
            System.out.println("Voce nasceu antes do seculo XX.");
        }

        sc.close();
    }
}
