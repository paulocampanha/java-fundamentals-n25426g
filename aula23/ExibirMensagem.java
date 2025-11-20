/* Nesse programa vamos criar alguns métodos (função) sem argumentos
*  e sem retorno.
*/
import java.util.Scanner;

public class ExibirMensagem {

    public static void linhaDupla(){
        System.out.println("=".repeat(40));
    }

    public static void cabecalho(){
        System.out.println("SENAI Celso Charuri");
        System.out.println("Avenida Carmela Dutra, 380");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        linhaDupla();
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        linhaDupla();
        System.out.print("Digite seu curso: ");
        String curso = sc.nextLine();
        linhaDupla();
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        linhaDupla();
        System.out.println("Dirija-se à escola abaixo: ");
        cabecalho();
    }

    
}