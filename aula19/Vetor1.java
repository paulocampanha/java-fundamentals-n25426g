/* Nesse programa vamos trabalhar com vetores mais conhecidos
 * com 'array'. Array é uma variavel (objeto) para armazenar
 * mais de um valor
 */

public class Vetor1 {
    
    public static void main(String args[]){

        int[] idades = new int[5];
        idades[0] = 18;
        idades[1] = 16;
        idades[2] = 25;
        idades[3] = 32;
        idades[4] = 29;

        for (int i = 0; i < 5; i++){
            System.out.println("Idade: " + idades[i] + " anos.");
        }

    }
}
