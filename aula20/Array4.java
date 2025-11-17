/* Nesse programa vamos criar um array bidimensional (matriz)
 * para armazenar as notas de 3 alunos nos 4 bimestres do
 * ano
 */

public class Array4 {
    
    public static void main(String args[]){

        double[][] notas = new double[3][4]; 
        // Linhas: 3 (índices 0, 1, 2)
        // Colunas: 4 (índices 0, 1, 2, 3)

        // Primeir grupo de notas (linha 0)
        notas[0][0] = 6.0;
        notas[0][1] = 8.5;
        notas[0][2] = 10.0;
        notas[0][3] = 7.9;

        // Segundo grupo de notas (linhas 1)
        notas[1][0] = 4.3;
        notas[1][1] = 3.4;
        notas[1][2] = 2.5;
        notas[1][3] = 2.0;

        // Terceiro grupo de notas (linha 2)
        notas[2][0] = 5.5;
        notas[2][1] = 6.0;
        notas[2][2] = 5.0;
        notas[2][3] = 6.5;
        
        String[] alunos = {"Gaspar", "Jorge", "Bruce"};
        double[] somaNotas = new double[3];
        double[] media = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do aluno " + alunos[i]);
            somaNotas[i] = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println((j+1) + "º Bim.: " + notas[i][j] + " | ");
                somaNotas[i] += notas[i][j];
            }
            System.out.println();
            
            media[i] = somaNotas[i] / notas[i].length;
            System.out.println("Média: " + media[i]);
            System.out.println("=".repeat(40));
        }
        
        



    }
}
