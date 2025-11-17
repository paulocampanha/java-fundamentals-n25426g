/* Nesse programa vamos estudar o operador lógico || (or - ou).
 * Esse operador retorna verdadeiro se pelo menos uma das condições
 * for verdadeira.
 */
package aula15;
import java.util.Scanner;
public class OperadoresLogicos2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Está acompanhado de maior de idade S/N: ");
        String resposta = sc.next();

        if (idade >= 18 || resposta.equalsIgnoreCase("S")){
            System.out.println("Aproveite o Show");
        } else {
            System.out.println("infelizmente você não pode entrar.");
        }
    }
}
