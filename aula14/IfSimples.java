package aula14;

import java.util.Scanner;

public class IfSimples {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println(
            "--- Verificação de Idade de Acesso ---");

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("--- Resultado ---");
            System.out.println("Idade verificada: "
            + idade + " anos.");
            System.out.println("Acesso Permitido");
        }

        System.out.println("=".repeat(40));
        System.out.println("Senai Guarulhos Dutra");

    }
}
