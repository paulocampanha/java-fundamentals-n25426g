/* Nesse programa vamos imprimir a tabuada do número 1 até
 * o número 10
 */

public class TabuadaCompleta {
    
    public static void main(String args[]){

        for (int i = 1; i<= 10; i++){
            System.out.println("Tabuada do " + i);
            System.out.println("=".repeat(40));
            for (int j = 1; j <= 10; j++){
                int total = i * j;
                System.out.printf("%2d X %2d = %3d %n", i, j, total);

            }
            System.out.println("=".repeat(40));
        }
    }
}
