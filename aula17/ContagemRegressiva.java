/* Nesse programa vamos simular uma contagem regressiva para o
 * disparo de um foguete usando a estrutura while
 */
public class ContagemRegressiva {
    
    public static void main(String args[]){
        int numero = 10;

        while (numero >= 0){
            System.out.print(numero + " ... ");
            numero -= 1;   // equivalente a numero = numero -1
        }
        System.out.println("F O G O ! ! !");
    }
}
