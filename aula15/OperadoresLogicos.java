/* Nesse programa vamos usar o operador lógico '&&' (and - e)
 * Esse operador retorna verdadeiro se todas os testes lógicos
 * forem verdadeiros
 */
package aula15;
import java.util.Scanner;
public class OperadoresLogicos {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura atual: ");
        int temperatura = sc.nextInt();

        if (temperatura <= 0) {
            System.out.println("Tempo Congelando");
        } else if (temperatura > 0 && temperatura <=10){
            System.out.println("Tempo Muito Frio");
        } else if (temperatura > 10 && temperatura <= 22) {
            System.out.println("Tempo Frio");
        } else if (temperatura > 22 && temperatura <= 30){
            System.out.println("Tempo Agradável");
        } else {
            System.out.println("Tempo muito quente");
        }
    }

}
