/* Nesse programa vamos criar um loop 'for' para imprimir os
 * número de 1 a 30 exceto os número multiplos de 3. Além disso
 * vamos interromper o loop quando chegar em 25
 */
public class LoopFor2 {

    public static void main(String args[]){

        for (int i = 1; i <= 30; i++){

            if (i % 3 == 0){
                continue;
            }

            if (i > 25) {
                break;
            }
            System.out.println("Numero: " + i);
        }
    }
}
