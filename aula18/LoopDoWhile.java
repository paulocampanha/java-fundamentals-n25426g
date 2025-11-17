/* Nesse programa valos esudar a estrutura de repetição do while */

public class LoopDoWhile {

    public static void main(String args[]){

        int contador = 1;

        do {
            System.out.println("Numero: " + contador);
            contador += 1;
        } while (contador <= 10);
        System.out.println("=".repeat(40));
    }
    
}
