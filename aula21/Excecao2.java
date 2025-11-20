/* Nesse programa vamos tratar o erro da divisão por 0 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

    public static void main(String args[]){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Vamos dividir os números.");
            System.out.print("Digite o numerador da divisão: ");
            int numerador = sc.nextInt();
            System.out.print("Digite o denominador da divisao: ");
            int denominador = sc.nextInt();
            int divisao = numerador / denominador;
            System.out.printf("O resultado da divisão é %d%n", divisao);
        
        } catch (ArithmeticException e) {
            System.out.println("Erro de calculo.");
            System.out.println(
                "Não é possivel dividir um número por zero.");
            System.out.println(
                "Entre em contato com o suporte e informe a mensagem abaixo:");
            System.out.println("ERRO: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de Entrada de dados.");
            System.out.println("Digite apenas números inteiro.");
            System.out.println(
                "Entre em contato com o suporte e informe a mesnagem abaixo: ");
            System.out.println("ERRO: " + e);   
        
        } catch (Exception e) {
            // Erro genérico
            System.out.println("Erro no sistema.");
            System.out.println(
                "Entre em contato com o suporte e informe o erro abaixo: ");
                System.out.println("ERRO: " + e);
        }
        
        System.out.println("--- Fim do Programa ---");
    }
}
