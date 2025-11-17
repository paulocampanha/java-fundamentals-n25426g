/* Nesse programa vamos imprimir uma sequência numérica do
 * 1 até o 10 usando a estrutura de repetição 'while'
 */

 public class Sequencia {

    public static void main(String args[]){

        int contador = 1;

        while (contador <= 10) {
            System.out.println("Número " + contador);
            contador += 1;
        }
        System.out.println("=".repeat(40));
        System.out.println("Fim do Contador");

    }
 }