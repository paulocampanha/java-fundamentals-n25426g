/* Nesse programa vamos calcular a média entre 3
 * notas de um  aluno, verificar a média atingida
 * e imprimir os comnceitos:
 * Acima de 90: A- Excelente
 * Acima de 75: B - Muito Bom
 * Acima de 60: c - Bom
 * Acima de 50: D - Suficiente
 * E - Reprovado
 */
package aula14;
import java.util.Scanner;
public class ConceitoFinal {

    public static void main(String args){

        String traco = "=";
        String risco = "-";
        Scanner sc = new Scanner(System.in);
        
        System.out.println(traco.repeat(40));
        System.out.println("--- Senai Celso Charuri ---");
        System.out.println(risco.repeat(40));
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Entre abaixo com as notas do aluno");
        System.out.print("Digite a 1ª nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        String conceito;
        
        if (media >= 90){
            conceito = "A - Excelente";
        } else if (media >= 75) {
            conceito = "B - Muito Bom";
        } else if (media >= 60) {
            conceito = "C - Bom";
        } else if (media >= 50) {
            conceito = "D - Suficiente";
        } else {
            conceito = "E - Reprovado";
        }
        System.out.println(risco.repeat(40));
        System.out.println("O aluno " + nome + "obteve a media " + media + " e seu conceito foi " + conceito);
        

    }
    
}
