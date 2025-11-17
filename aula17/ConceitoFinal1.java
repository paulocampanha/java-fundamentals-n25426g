/* Nesse programa vamos usar a estrutura de loop while para receber
 * quatro notas digitadas por um professor de um determinado aluno,
 * em seguida calcular a média e imprimir a situação final do aluno
 * como aprovado, reprovado ou de recuperação
 */
import java.util.Scanner;
public class ConceitoFinal1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double somaNotas = 0;
        double media = 0;
        double contador = 1;

        while (contador <= 4) {
            System.out.print("Digite a " + contador + "ª nota: ");
            nota = sc.nextDouble();
            somaNotas += nota;
            contador += 1;
        }
        System.out.println("=".repeat(40));
        media = somaNotas / 4;
        if (media >= 6) {
            System.out.println("O aluno está APROVADO!");
        } else if (media >= 3) {
            System.out.println("O aluno está de RECUPERAÇÃO!");
        } else {
            System.out.println("O aluno está REPROVADO!");
        }
        System.out.println("A média do aluno foi " + media);
    }
    
    
}
