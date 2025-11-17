package aula15;
import java.util.Scanner;

public class FaixaEtaria {

    public static void main(String args[]){

        String linha = "=";
        Scanner sc = new Scanner(System.in);
        System.out.println(linha.repeat(40));
        System.out.println("    Sistema de Verificação de Idade");
        System.out.println(linha.repeat(40));
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Faixa Etária: ");
        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}


