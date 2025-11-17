/* Nesse programa vamos trabalhar com duas arrays. Um com o nome
 * do produto e outra com o valor. Cada valor se refere a produto
 * no mesmo índice
 */
import java.util.Scanner;

public class Array3 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos produtos deseja lançar: ");
        int numeroProdutos = sc.nextInt();

        String[] produtos = new String[numeroProdutos];
        double[] valores = new double[numeroProdutos];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto numero " + (i+1));
            System.out.print("Digite o nome do produto: ");
            sc.nextLine();
            produtos[i] = sc.nextLine();            
            System.out.print("Digite o valor do produto: ");
            valores[i] = sc.nextDouble();
        }

        for (int i = 0; i < produtos.length; i++){
            System.out.println((i+1) + " - " + produtos[i] + ": R$ " +
            valores[i]);
        }
    }
}
