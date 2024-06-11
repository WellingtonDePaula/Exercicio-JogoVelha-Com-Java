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

        //Iniciando a matriz/tabela
        tabela.setUpMatriz();
        ////////////////////////////////

        //Começando o jogo
        System.out.println("\nQue comecem os jogos: ");

        tabela.drawMatriz();

        while(true) {
            int column;
            int line;
            double insTabela;
            boolean played = false;

            while(!played) {
                //Jogador1 joga
                insTabela = jogador1.play();
                column = (int) (insTabela%10) - 1;
                line = (int) (Math.floor(insTabela/10)) - 1;
                played = tabela.addPlayToMatriz(column, line, jogador1);
            }
            //retorna a variavle de ter jogado para false
            played = false;

            tabela.drawMatriz();
            tabela.checkWin(jogador1);

            //para o loop caso alguém vença
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

            //para o loop caso alguém vença
            if(tabela.someoneWin) {
                break;
            }
        }
    }
}