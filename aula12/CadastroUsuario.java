package aula12;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String args[]){

        Scanner leia = new Scanner(System.in);

        System.out.println("=".repeat(40));
        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();
        System.out.print("Digite o nome da sua cidade: ");
        String cidade = leia.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.print("Digite sua altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("=".repeat(40));
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.print("Você confirma esses dados S/N: ");
        String resposta = leia.next();




    }

}
