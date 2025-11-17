/* Nesse programa vamos criar uma array de nomes, inserindo os
 * valores diretamenta na linha de declaração da array
 */

public class Array2 {
    
    public static void main(String args[]) {

        String[] gatas = {"Anabela", "Luiza", "Neve", "Blue", "Xuxu"};

        System.out.println("Numero de gastas: " + gatas.length);
        int num = 1;
        // for-each
        for (String gata : gatas) {
            System.out.println("Nome da gata " + num + ": " + gata);
            num++;
        }
    }
}
