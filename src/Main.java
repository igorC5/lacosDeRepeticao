import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        String[] players = new String[10];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + (i + 1));
            players[i] = input.nextLine();
        }

        System.out.println("nome dos 10 jogadores: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(players[i]);
        }
        */

        Scanner input = new Scanner(System.in);

        System.out.println("diga o nome do TIME A: ");
        String timeA = input.nextLine();
        String[] listaA = new String[5];

        System.out.println("diga o nome do time B: ");
        String timeB = input.nextLine();
        String[] listaB = new String[5];

        System.out.println("Diga o nome dos jogadores do time " + timeA);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + (i + 1));
            listaA[i] = input.nextLine();
        }

        System.out.println("Diga o nome dos jogadores do time " + timeB);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome do Player " + (i + 1));
            listaB[i] = input.nextLine();
        }

        System.out.println("Nome do time A: " + timeA);
        System.out.println("Nome do time B: " + timeB);

        System.out.println("Jogadores do time " + timeA);
        for (int i = 0; i < 5; i++) {
            System.out.println(listaA[i]);
        }

        System.out.println("Jogadores do time " + timeB);
        for (int i = 0; i < 5; i++) {
            System.out.println(listaB[i]);
        }
    }
}