import java.util.Scanner;
import java.util.Locale;

public class Exe07 {
    public static void main (String[] args) {
        Locale br = new Locale ("pt", "BR");
        Scanner sc = new Scanner (System.in).useLocale (br);

        //declarando as variaveis.
        double[] pecas = new double[5];                             
        double soma = 0;
        int cont = 0;                       
        String opcao;

        do{

            //vendo o tamanho das pecas.
            while (cont < pecas.length) {
                System.out.print ("\nDigite o tamanho da peca: ");
                pecas[cont] = sc.nextDouble();
                cont++;
            }

            //tirando o resultado da variavel soma.
            for (int i = 0; i < pecas.length; i++) {                                
                soma += pecas[i];
            }

            //tirando o resultado da media.
            double media = soma / pecas.length;

            //imprimindo a media.
            System.out.println ("\n--------------------------------------");
            System.out.printf (br,"\nA media das 5 pecas e de: %.2f", media);
            
            //limpando as variaveis.
            soma = 0;
            cont = 0;
             for (int i = 0; i < pecas.length; i++) {
                pecas[i] = 0;
             }

            //perguntando se deseja realizar o processo novamente.                                                       
            System.out.print ("\nVoce deseja processar um novo lote? ");
            sc.nextLine();
            opcao = sc.nextLine().toUpperCase();

            if (opcao.equals("NAO") || opcao.equals("NÃO")) {
                System.out.print ("\nOK. Tenha um otimo dia!");
            }

        }while (opcao.equals("SIM"));


        sc.close();
    }
}
//Um engenheiro quer calcular a média de 5 peças por lote. O
//programa deve processar 5 peças (usando for) e, após o lote, perguntar
//se deseja processar um novo lote (usando do-while).