/* Nesse programa vamos testar se uma pessoa tem idade
 * para votar ou não
 */
package aula14;
import java.util.Scanner;

public class IfElse {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Você já pode votar na próxima eleição");
            System.out.println("Se não possuir título de elitor, procure um Cartorio Eleitoral");
        } else {
            System.out.println("Você não pode votar ainda.");
            System.out.println("Mas pode acompanhar o processo democrático.");
        }
        String traco = "=";
        System.out.println(traco.repeat(40));
        System.out.println("Tribunal Reginal Eleitoral");
    }
}
