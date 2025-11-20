/* Nesse programa vamos criar uma exceção dentro de um loop
 * while, ou seja, enquanto o usuário não digitar um valor
 * válido, o programa não encerra.
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecao4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um número para divisão: ");
                int numero1 = sc.nextInt();
                System.out.print("Digite o numero divisor: ");
                int divisor = sc.nextInt();
                int divisao = numero1 / divisor;
                System.out.printf(
                    "%d / %d = %d%n",numero1, divisor, divisao);
                break;
            } catch (InputMismatchException e) {
                System.err.println("ERRO: Digite apenas números inteiro.");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("O número divisor não pode ser 0.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro no sistema. Informe o suporte.");
                System.out.println(e);
                sc.nextLine();
            } finally {
                System.out.println("=".repeat(40));                
            }
        }
        sc.close();
        System.out.println("Curso de Java Fundamentals");
    }
}
