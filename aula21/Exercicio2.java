import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos deseja lancar: ");
        int numeroAlunos = sc.nextInt();
        sc.nextLine();
               
        String[] nomes = new String[numeroAlunos];

        double[][] notas = new double[numeroAlunos][4];

        for (int i = 0; i < numeroAlunos; i++){
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = sc.nextLine();
            for (int j = 0; j < 4; j++){
                System.out.print("Digite a " + (j+1) + "ª nota do aluno: ");
                notas[i][j] = sc.nextDouble();
                
            }
            sc.nextLine();
        }
        int[] somaNotas = new int[numeroAlunos];
        int[] media = new int[numeroAlunos];
        for (int i = 0; i < numeroAlunos; i++){
            for(double nota: notas[i]){
                somaNotas[i] += nota;
            }
            media[i] = somaNotas[i] / 4;
        }

        for (int i = 0; i < numeroAlunos; i++){
            System.out.println("Aluno: " + nomes[i] + " Média" + media[i]);
        }
        sc.close();
    
        
        

    }
    
}
