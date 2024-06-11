package wellz.dominio;

import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);

    public boolean playAgain() {
        while (true) {
            System.out.println("\nDeseja jogar novamente? S/N");
            String input = sc.nextLine().toUpperCase();
            if (input.equals("S")) {
                return true;
            }
            if(input.equals("N")) {
                return false;
            }
            System.out.println("Input inválido, tente novamente");
        }
    }
}
