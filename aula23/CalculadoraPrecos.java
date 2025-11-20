/* Nesse programa vamos cria um método com argumento e com retorno
 */

import java.util.Scanner;

public class CalculadoraPrecos {

    public static double calcularDesconto(double preco, double percentual) {
        if (percentual < 0 || percentual > 100) {   // ||  significa or(ou)
            System.out.println("Erro: Percentual de desconto inválido");
            return preco;
        }
        double valorDesconto = preco * (percentual / 100);
        return preco - valorDesconto;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = sc.nextDouble();
        double valorComDesconto = 
        calcularDesconto(valorProduto, percentualDesconto);
        System.out.printf(
            "Valor com desconto R$ %.2f%n", valorComDesconto);
    }
}
