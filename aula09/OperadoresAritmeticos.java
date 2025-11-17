/* Nesse programa vamos usar as quatro operações da matemática
e o operador módulo do Java. O operador módulo retorna o resto
da divisão de dois números
*/

public class OperadoresAritmeticos {
	
	public static void main(String args[]){
		
		int num1, num2, somaInteiro, subInteiro, multInteiro, divInteiro, moduloInteiro;
		
		double num3, num4, somaDecimal, subDecimal, multDecimal, divDecimal, moduloDecimal;
		
		num1 = 123;
		num2 = 500;
		somaInteiro = num1 + num2;
		subInteiro = num1 - num2;
		multInteiro = num1 * num2;
		divInteiro = num1 / num2;
		moduloInteiro = num1 % num2;
		
		System.out.println("Resultado dos cálculos feitos com os número: " + num1 + " e " + num2);
		System.out.println("Soma: " + somaInteiro);
		System.out.println("Subtração: " + subInteiro);
		System.out.println("Multiplicação: " + multInteiro);
		System.out.println("Divisão: " + divInteiro);
		System.out.println("Resto da divisão: " + moduloInteiro);
		System.out.println("===============================");
		

	}
}