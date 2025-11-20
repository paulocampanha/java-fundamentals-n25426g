/* Faça um programa que recebe o nome de um aluno, as quatro notas
 * dos quatro bimestres, calcule a média e imprima:
 * Aluno {Fulano de Tal} APROVADO com a média XX.
 * Aluno {Fulano de Tal} REPROVADO com a média XX.
 * Aluno {Fulano de Tal} obteve a média XX e ficou de recuperação.
 * Para calcular a média use a fórmula:
 * (n1 + n2 + n3 + n4) / 4
 * Para ser aprovado a média precisa ser maior do que 6. 
 * Entre 3 e 5.99 o aluno está de recuperação e abaixo de 
 * 2.99 o aluno está reprovado. 
 * Crie uma estrutura 'try - catch' para evitar que o professor
 * digite um número inválido. Se o professor digitar um valor
 * inválido, imprima uma mesnagem: ERRO: Nota digitada inválida. 
 * Digite apenas números. Execute o programa novamente.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
    
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Digite a primeira nota: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double n2 = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double n3 = sc.nextDouble();
            System.out.print("Digite a quarta nota: ");
            double n4 = sc.nextDouble();
            double media = (n1 + n2 + n3 + n4) / 4;

            if ( media >= 6) {
                System.out.printf(
                "O Aluno %s está APROVADO com a média %.2f.%n"
                    ,nome, media);
            } else if (media >= 3 && media < 6) {
                System.out.printf(
                "O Aluno %s obteve a média %.2f e ficou de REUPERAÇÃO.%n"
                ,nome, media);
            } else {
                System.out.printf(
                "O Aluno %s está REPROVAO com a média %.2f"
                ,nome, media);
            }

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Nota digitada inválida.");
            System.out.println("Digite apenas números. ");
            System.out.println("Execute o programa novamente.");
        }

        

    }
}
