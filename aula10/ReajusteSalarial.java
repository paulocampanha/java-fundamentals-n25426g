public class ReajusteSalarial {
	public static void main(String args[]) {
		double salario, aumento;
		
		//Salário do funcionário
		salario = 5000.00;
		
		//Calcular o aumento de 15%
		aumento = salario * 15 / 100;
		
		//Aplicar o aumento de 15%
		//Eq. a salario = salario + aumento
		salario += aumento;
		
		System.out.println("Novo salário: R$
		" + salario);
	}
}