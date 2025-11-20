/* Nesse programa vamos trabalhar com tratamento de erros.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao1 {

    public static void main(String args[]){

        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("Você tem %d anos.%n", idade);

        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros.");
        }
    }    
    
}
