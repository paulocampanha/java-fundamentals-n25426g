/* Exercício 1: Cálculo de Saldo Simples (int)
1. Declare e inicialize a variável saldo com o valor inicial de 1500
2. Imprima o Saldo Inicial no console.
3. Simule um débito de R$ 350.00 (despesa).
4. Imprima o Novo Saldo no console.
5. Simule um crédito de R$ 500.00 (receita).
6. Imprima o Novo Saldo no console.
*/
public class ExercicioCalculoSimples {
	public static void main(String args[]) {
		double saldo, receita, despesa;
		
		saldo = 1500.00;
		System.out.printf("Saldo Inicial: R$ %,.2f%n", saldo);
		
		despesa = 350.00;
		saldo -= despesa;
		System.out.printf("Despesa: R$  %,.2f%n", despesa);
		System.out.printf("Novo Saldo: R$  %,.2f%n", saldo);
		
		receita = 500.00;
		System.out.printf("Receita: R$  %,.2f%n", receita);
		saldo += receita;
		System.out.printf("Novo Saldo: R$  %,.2f%n", saldo);
		
		
	}
}
