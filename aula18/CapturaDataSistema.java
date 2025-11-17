/* Nesse programa vamos capturar a data atual do computador e
 * imprimir uma sequência de vencimentos.
 */

 import java.time.LocalDate;
 import java.util.Scanner;

 public class CapturaDataSistema {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();

        System.out.printf("Data atual: %d/%d/%d%n", dia, mes, ano);
        
        int contador = 1;
        int limite = 30;

        while (contador <= limite){
            System.out.printf("Vencimento: %02d/%02d/%d%n", dia, mes, ano);
            mes += 1;
            if (mes > 12){
                mes = 1;
                ano += 1;
            }
            contador += 1;
        }
    
    }
 }