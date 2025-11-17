/* Nesse programa vamos usar a estrutura de repetição loop while
 * para receber notas digitadas por um professor, calcular a média
 * do aluno e imprimir o conceito final. Para controle do loop
 * o progama deve questinar o professor se ele deseja continuar
 * inserindo notas
 */
import java.util.Scanner;

public class ConceitoFinal2 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        double nota = 0;
        double somaNotas = 0;
        double media = 0;
        int numeroDeNotas = 0;
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Digite a nota do aluno: ");
            nota = sc.nextDouble();
            somaNotas += nota;
            numeroDeNotas += 1;
            System.out.print("Deseja inserir outra nota S/N: ");
            resposta = sc.next();
        }

        media = somaNotas / numeroDeNotas;
        System.out.println("=".repeat(40));
        System.out.println("A média do aluno foi " + media);


    }
}
