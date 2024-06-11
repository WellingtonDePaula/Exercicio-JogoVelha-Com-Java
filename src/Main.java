import wellz.dominio.Jogador;
import wellz.dominio.Tabela;

public class Main {
    public static void main(String[] args) {
        Tabela tabela = new Tabela();
        //Criando jogadores
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        ///////////////////

        //Setando jogador1 e jogador2
        jogador1.selectName("1");
        jogador2.selectName("2");
        /////////////////////////////

        //Selecionando o símbolo representante
        jogador1.selectSymbol(jogador2);
        //////////////////////////////////////

        //Fazendo o setting up da matriz
        tabela.setUpMatriz();
        ////////////////////////////////

        //Começando o jogo
        System.out.println("Que comecem os jogos: ");

        tabela.drawMatriz();

        while(true) {
            double insTabela;
            boolean played = false;
            int column;
            int line;

            while(!played) {
                //Jogador1 joga
                insTabela = jogador1.play();
                column = (int) (insTabela%10) - 1;
                line = (int) (Math.floor(insTabela/10)) - 1;
                played = tabela.addPlayToMatriz(column, line, jogador1);
            }
            played = false;
            tabela.drawMatriz();
            tabela.checkWin(jogador1);
            if(tabela.someoneWin) {
                break;
            }
            ///////////////

            while(!played) {
                //Jogador 2 joga
                insTabela = jogador2.play();
                column = (int) (insTabela%10) - 1;
                line = (int) (Math.floor(insTabela/10)) - 1;
                played = tabela.addPlayToMatriz(column, line, jogador2);
            }
            tabela.drawMatriz();
            tabela.checkWin(jogador2);
            if(tabela.someoneWin) {
                break;
            }
        }
    }
}