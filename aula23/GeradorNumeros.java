/* Nesse programa vamos criar um método sem argumentos e com
   retorno para gerar um número aleatório
 */

import java.util.Scanner;
import java.util.Random;

public class GeradorNumeros {

    public static int gerarNumeroAleatorio() {
        Random rd = new Random();
        int inicio = 1;
        int fim = 59;
        int numeroAleatorio = rd.nextInt(fim) + 1;
        return numeroAleatorio;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos número deseja gerar: ");
        int numeros = sc.nextInt();
        int[] numerosSorteados = new int[numeros];

        for (int i = 0; i < numeros; i++) {
            numerosSorteados[i] = gerarNumeroAleatorio() ;
        }

        for (int numeroSorteado : numerosSorteados) {
            System.out.print(numeroSorteado + " ");
        }

    }
}
