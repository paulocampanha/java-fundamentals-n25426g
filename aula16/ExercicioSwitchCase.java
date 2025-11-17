/* Crie um programa em Java que simule um sistema bancário simples 
*  com um menu interativo. O programa deve:
*  Exibir um menu com as seguintes opções:
*  1 - Depositar
*  2 - Sacar
*  3 - Saldo Atual
*  4 - Sair do Sistema
*  Inicializar uma variável saldo com o valor 10000.00.
*  Permitir que o usuário escolha uma das opções e execute a ação 
*  correspondente:
*  Depositar: Solicitar ao usuário o valor a ser depositado e 
*  atualizar o saldo.
*  Sacar: Solicitar ao usuário o valor a ser sacado e atualizar 
*  o saldo (verifique se há saldo suficiente).
*  Saldo Atual: Exibir o saldo atual.
*  Sair: Encerrar o programa.
*  Utilizar a estrutura switch-case para tratar as opções do menu.
 */

import java.util.Scanner;

public class ExercicioSwitchCase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 10000.00;

        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Saldo Atual");
        System.out.println("4 - Sair do Sistema");
        System.out.print("Digite a opção deseja do menu: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor do deposito: ");
                double deposito = sc.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Novo saldo: R$ " + saldo);
                break;
            case 2:
                System.out.print("Digite o valor do saque: ");
                double saque = sc.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - saque;
                }
                System.out.println("Saldo atual: R$ " + saldo);
                break;
            case 3:
                System.out.println("Saldo atual: R$ " + saldo);
                break;
            case 4:
                System.out.println("Saindo do Sistema");
                break;
            default:
                System.out.println("Opção selecionada inválida");
                break;            
        }
        System.out.println("=".repeat(40));

    }
}
