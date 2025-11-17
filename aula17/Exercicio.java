import java.util.Scanner;

public class Exercicio {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nomeDoProduto;
        double valorDoProduto;
        int numeroDeParcelas = 0;
        double valorDaParcela;
        int contador = 1;

        System.out.println("=".repeat(50));
        System.out.println("***** Lojas Maravilha *****");
        System.out.println("=".repeat(50));
        System.out.println("Sistema de vendas");
        System.out.println("-".repeat(50));
        System.out.print("Digite o nome do produto: ");
        nomeDoProduto = sc.nextLine();
        System.out.print("Digite o valor do Produto: ");
        valorDoProduto = sc.nextDouble();

        while (numeroDeParcelas <= 10) {
            System.out.print("Digite o número de parcelas desejada: ");
            numeroDeParcelas = sc.nextInt();
            if (numeroDeParcelas < 0 || numeroDeParcelas > 10){
                System.out.println("Número de parcelas inválido. Escolha de 1 a 10 parcelas.");
                numeroDeParcelas = 0;
            } else {
                break;
            }
        }

        valorDaParcela = valorDoProduto / numeroDeParcelas;

        System.out.println("-".repeat(50));
        System.out.println("Produto: " + nomeDoProduto);
        System.out.printf("Valor Total: R$ %.2f%n", valorDoProduto);
        System.out.println("Parcelas: " + numeroDeParcelas);
        System.out.println("-".repeat(50));

        while (contador <= numeroDeParcelas) {
            System.out.printf("Parcela %d: R$ %.2f %n", contador, valorDaParcela);
            contador += 1;
        }
        System.out.println("=".repeat(50));
        System.out.println("Sistema de Vendas");
        System.out.println("=".repeat(50));                
    }    
}
