public class TipoString {
    public static void main(String args[]){

        String nomeAluno = "Gaspar Neve";
        String cidadeAluno = "São Paulo";

        System.out.println("Nome do aluno: " + nomeAluno);

        System.out.println("Cidade: " + cidadeAluno);

        String nomeMaiusculo = nomeAluno.toUpperCase();

        String cidadeMinusculo = cidadeAluno.toLowerCase();

        System.out.println("Maiúsculas: " + nomeMaiusculo);

        System.out.println("Minusculas: " + cidadeMinusculo);
    }

}
