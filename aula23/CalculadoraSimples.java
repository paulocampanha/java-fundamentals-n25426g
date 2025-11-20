/* Nesse programa vamos criar alguns métodos (funções) com 
*  argumentos e sem retorno
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSimples {
    
    public static void cabecalho(){
        System.out.println("=".repeat(40));
        System.out.println("--- Calculadora Simples ---");
        System.out.println("=".repeat(40));
    }

    public static void somar(int n1, int n2){
        int total = n1 + n2;
        System.out.println("Total da soma: " + total);
    }

    public static void subtrair(int n1, int n2){
        int total = n1 - n2;
        System.out.println("Total da subtração: " + total);
    }

    public static void multiplicar(int n1, int n2){
        int total = n1 * n2;
        System.out.println("Total da multiplicação: " + total);
    }

    public static void dividir(int n1, int n2) {
        int total = n1 / n2;
        System.out.println("Total da divisão: " + total);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                cabecalho();
                System.out.print("Digite o primeiro número: ");
                int numero1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                int numero2 = sc.nextInt();
                somar(numero1, numero2);
                subtrair(numero1, numero2);
                multiplicar(numero1, numero2);
                dividir(numero1, numero2);
                System.out.print("Deseja executar outro calculo S/N: ");
                String resposta = sc.next();
                if (resposta.equalsIgnoreCase("N")){
                    break;
                } else if (resposta.equalsIgnoreCase("S")){
                    continue;
                } else {
                    System.out.println("Resposta inválida. Saindo o sistema.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas número inteiros.");
                System.out.println("Tente novamente...");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Não digite 0 para os calculos.");
                System.out.println("Tente novamente...");
                sc.nextLine();
            }
        }
    }
}
