public class OperadoresAtribuicao {
	
	public static void main(String args[]) {
		int valor;
		
		valor = 20;
		System.out.println("Valor: "+valor);
		
		valor = valor + 5;
		
		System.out.println("Valor + 5: "+valor);
		
		//Operador de adição e atribuição
		// equivalente a valor = valor + 15;
		valor += 15;
		
		System.out.println("Valor + 15: "+valor);
		
		//Op. de subtração e atribuição
		// equivalente a valor = valor - 10;
		valor -= 10;
		
		System.out.println("Valor -10: "+valor);
		
		//Op. de multiplicação e atribuição
		// equivalente a valor = valor * 5
		valor *= 5;
		System.out.println("Valor * 5: "+valor);
		
		//op. de divisão e atribuição
		// equivalente a valor /= 7
		valor /= 7;
		
		System.out.println("Valor / 7: "+ valor);
		
		//Op. de modulo e atribuição
		//equivalente a valor = valor % 2;
		valor %= 2;
		
		System.out.println("Valor % 2: "+ valor);
	}
}