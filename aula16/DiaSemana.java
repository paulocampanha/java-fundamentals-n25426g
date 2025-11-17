/* Nesse programa vamos usar o switch case para localizar o dia da 
 * semana de acordo com seu número
 */
import java.util.Scanner;
public class DiaSemana {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do dia da semana (1 a 7)");
        int diaDaSemana = sc.nextInt();
        String nomeDoDia = "";     // Domingo, Segunda-Feira, Terça-Feira,...
        String tipoDoDia = "";     // Fim de Semana, Dia Útil

        switch (diaDaSemana){
            case 1: 
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-Feira";
                break;
            case 3: 
                nomeDoDia = "Terça-Feira";
                break;
            case 4:
                nomeDoDia = "Quarta-Feira";
                break;
            case 5:
                nomeDoDia = "Quinta-Feira";
                break;
            case 6:
                nomeDoDia = "Sexta-Feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Número inválido para dias da semana.";
        }
        System.out.println("O dia da semana selecionado foi: ");
        System.out.println(nomeDoDia);

        switch (diaDaSemana) {
            case 1:
            case 7:
                tipoDoDia = "Fim de Semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                tipoDoDia = "Dia Útil";
                break;
        }
        System.out.println(tipoDoDia);
    }
    
}
