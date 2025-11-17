/*
Nesse programa vamos fazer alguns calculos com números decimais
*/

public class Operadores {

	public static void main(String args[]){

		double valor1, valor2, valor3;
		double soma, sub, mult, div, modulo;
		int numero;
		
		numero = 13;
		valor1 = numero;
		
		valor2 = 10;
		valor3 = 30.35;
		
		
		
		soma = valor1 + valor2;
		System.out.println("Soma: " + soma);
		sub = valor3 - valor1 + valor2;
		System.out.println("Subtração: " + sub);
		mult = valor2 * valor1 + valor3;
		System.out.println("Multiplicação: " + mult);
	}
		
}
			