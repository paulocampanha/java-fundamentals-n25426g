/* Nesse programa vamos usar uma biblioteca do java para sortear
 * um número aleatório entre 1 e 10 e solicitar ao jogador que 
 * adivinhe esse número. O jogador terá três chances de acertar o
 * número sorteado. A cada erro recebe uma dia sobre a posição do
 * seu palpite sendo maior ou menor do que o número sorteado. 
 */

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroSecreto = rd.nextInt(10) + 1;
        int tentativas = 3;
        int palpite;

        System.out.println("~".repeat(50));
        System.out.println("Bem-vindo ao jogo de adivinhação");
        System.out.println("Você tem 3 tentativas para adivinhar um número entre 1 e 10");
        System.out.println("~".repeat(50));

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            if (palpite == numeroSecreto) {
                break;
            } else if(palpite > numeroSecreto) {
                System.out.println("O seu palpite e maior do que o numero secreto.");
            } else {
                System.out.println("O seu palpite e menor do que o numero secreto.");
            }
            tentativas -= 1;
        } while (tentativas > 0);

        if (tentativas > 0){
            System.out.println("Parabens!!! Você acertou o numero secreto.");
        } else {
            System.out.println("Perdeu!!! Você não acertou o numero secreto.");
            System.out.println("O numero secreto é " + numeroSecreto);
        }

    }
}
