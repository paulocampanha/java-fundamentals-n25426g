package aula12;

import java.util.Scanner;

public class CalculadoraSimples {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outr número: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("=".repeat(40));
        System.out.printf("Soma: %d + %d = %d%n",
        num1, num2, soma);
        System.out.printf("Subtração: %d - %d = %d%n",
        num1, num2, sub);
        System.out.printf("Multiplicação: %d x %d = %d%n",
        num1, num2, mult);
        System.out.printf("Divisão: %d : %d = %d%n",
        num1, num2, div);
        System.out.printf(
            "Resto da divisão: %d : %d = %d o resto é %d%n",
            num1, num2, div, mod);
    }
}
