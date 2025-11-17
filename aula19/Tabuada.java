/* Nesse programa vamos solicitar ao usuário um número para
 * gera e imprimir a tabuada desse número
 */
import java.util.Scanner;

public class Tabuada {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("=".repeat(40));
        System.out.println("--- Tabauada do " + numero + " ---");
        System.out.println("=".repeat(40));

        for (int i = 1; i <= 10; i++){
            int total = numero * i;
            System.out.printf("%2d X %2d = %3d %n", numero, i, total);
        }
        System.out.println("=".repeat(40));
    }
}
