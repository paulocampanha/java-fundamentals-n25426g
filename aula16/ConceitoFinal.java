import java.util.Scanner;

public class ConceitoFinal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a letra da nota do aluno: ");
        String nota = sc.next();
        nota = nota.toUpperCase();

        switch (nota) {
            case "A":
                System.out.println("Aluno Aprovado");
                System.out.println("Sua nota foi A");
                break;
            case "B":
                System.out.println("Aluno Aprovado");
                System.out.println("Sua nota foi B");
                break;
            case "C":
                System.out.println("Aluno Apovado");
                System.out.println("Sua nota foi C");
                break;
            case "D":
                System.out.println("Aluno de Recuperação");
                System.out.println("Sua nota foi D");
                break;
            case "E":
                System.out.println("Aluno Reprovado");
                System.out.println("Sua nota foi E");
                break;
            default:
                System.out.println("Nota inválida");
        }
        System.out.println("=".repeat(40));
        System.out.println("Escola SESI");
    }
}