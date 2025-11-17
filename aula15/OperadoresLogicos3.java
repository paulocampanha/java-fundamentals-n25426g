/* Nesse programa vamos estudar o operador lógico ! (not - não) 
 * Esse operador retorna verdadeiro se a condições resultar
 * um inversão do valor
*/
package aula15;
import java.util.Scanner;
public class OperadoresLogicos3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número par: ");
        int numero = sc.nextInt();

        if (numero % 2 != 0){
            System.out.println("Você digitou um número Ímpar");
        }

        System.out.print("Digite sua escola: ");
        String escola = sc.next();

        if (escola.toUpperCase("SENAI")){
            System.out.println("Você não é aluno do Senai.");
            System.out.println("Dirija-se ao balcão de informação");
        }
    }
}