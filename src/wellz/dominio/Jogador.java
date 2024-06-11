package wellz.dominio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador {
    public String name;
    public String symbol;
    private Scanner sc = new Scanner(System.in);

    //Faz a jogada do jogador
    public double play() {
        int retorno = -1;
        boolean validInput = false;

        while(!validInput) {
            try {
                System.out.println("\n" + name + " escolha a coluna e a linha por números de 1 a 3, nesta ordem");
                retorno = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException exception) {
                System.out.println("Você é burro por acaso?");
                sc.next();
            }
        }
        //retorna o input de coluna e linha
        return retorno;
    }
    //Seta o nome do jogador para o objeto
    public void selectName(String playerNumber) {
        System.out.println("Escolha o nome do jogador" + playerNumber);
        name = sc.nextLine().toUpperCase();
        System.out.println();
    }

    //Seleciona o símbolo que o jogador quer
    public void selectSymbol(Jogador jogador) {
        while(true) {
            System.out.println("Jogador " + name + " selecione se quer jogar com o símbolo X ou O");
            symbol = sc.nextLine().toUpperCase();
            //Pede o input de simbolo novamente caso o mesmo seja inválido
            if(!symbol.equals("X") && !symbol.equals("O")) {
                System.out.println(symbol + " é um simbolo inválido, tente novamente");
                continue;
            }
            break;
        }
        //Seta o símbolo para o jogador2
        if(symbol.equals("X")) {
            jogador.symbol = "O";
        } else {
            jogador.symbol = "X";
        }
    }
}
