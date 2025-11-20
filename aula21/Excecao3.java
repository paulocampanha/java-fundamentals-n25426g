/* Nesse programa vamos tratar um erro de conversão de dados */

import java.util.Scanner;

public class Excecao3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            String texto = sc.next();

            int numero = Integer.parseInt(texto);
            System.out.println("Número digitado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Digite apenas números.");
        } finally {
            System.out.println("Curso de Java Fundamentals");
            sc.close();
        }

    }
}
