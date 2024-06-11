package wellz.dominio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador {
    public Scanner sc = new Scanner(System.in);
    public String name;
    public String symbol;

    public double play() {
        int retorno = -1;
        boolean validInput = false;
        while(!validInput) {
            try {
                System.out.println(name + " escolha a coluna e a linha por números de 1 a 3, nesta ordem");
                retorno = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException exception) {
                System.out.println("Você é burro por acaso?");
                sc.next();
            }
        }
        return retorno;
    }

    public void selectName(String playerNumber) {
        System.out.println("Escolha o nome do jogador" + playerNumber);
        name = sc.nextLine();
    }

    public void selectSymbol(Jogador jogador) {
        while(true) {
            System.out.println("\nJogador " + name + " selecione se quer jogar com o símbolo X ou O");
            symbol = sc.nextLine().toUpperCase();
            if(!symbol.equals("X") && !symbol.equals("O")) {
                System.out.println(symbol + " é um simbolo inválido, tente novamente");
                continue;
            }
            if(symbol.equals("X")) {
                jogador.symbol = "O";
            } else {
                jogador.symbol = "X";
            }
            break;
        }
    }
}
