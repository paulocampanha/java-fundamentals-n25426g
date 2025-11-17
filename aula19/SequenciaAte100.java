/* Nesse program vamos usar a estrutura 'for' para imprimir uma 
 * sequência de número do 10 ao 100 com intervalos de 10 em 10
 */

public class SequenciaAte100 {

    public static void main(String args[]){

        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i + "...");
        }
        System.out.println("Fim");
    }
    
}
