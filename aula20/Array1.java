/* Nesse programa vamos criar uma array para armagenar notas de
 * um aluno, calcular a média e imprimir o conceito final
 */
import java.util.Scanner;
 public class Array1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas deseja lançar: ");
        int numeroNotas = sc.nextInt();

        double[] notas = new double[numeroNotas];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota: ");
            notas[i] = sc.nextDouble();
        }

        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++){
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;
        if (media >= 0 && media <= 2) {
            System.out.println("Aluno REPROVADO. Média: " + media);
        }else if (media > 2 && media <= 6) {
            System.out.println("Aluno em RECUPERAÇÃO. Média: " + media);
        } else if (media > 6 && media <= 10) {
            System.out.println("Aluno APROVADO. Média: " + media);
        } else {
            System.out.println("Problema com as notas. Média inválida");
        }

    }
 }