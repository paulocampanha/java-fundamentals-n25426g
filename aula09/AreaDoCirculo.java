/*
Nesse programa vamos calcular a área de um círculo
*/

public class AreaDoCirculo {
	// constante PI
	public static final double PI = 3.14159;
		
	public static void main(String args[]){
		
		// A formula da área do círculo é
		// pi * raio²
		
		double raio = 5.0;

		
		double area = PI * (raio * raio);
		//O circulo de raio 5.0 tem sua área calculada em 78.53975
		System.out.printf("O círculo de raio %.2f tem sua área calculada em %.2f.%n", raio, area);
	}
}