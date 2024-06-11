//package wellz.test;
//
//import wellz.dominio.Jogador;
//import wellz.dominio.Tabela;
//
//public class MainTest02 {
//    public static void main(String[] args) {
//        Tabela tabela = new Tabela();
//        Jogador jogador = new Jogador();
//
//        jogador.selectSymbol();
//
//        tabela.setUpMatriz(jogador);
//        System.out.println("Que comecem os jogos hehe");
//        tabela.drawMatriz();
//        while (!tabela.someoneWin) {
//
//            //Jogada do player
//            double insTabela = jogador.play();
//            int coluna = (int) (insTabela % 10) - 1;
//            int linha = (int) (Math.floor(insTabela / 10)) - 1;
//            tabela.addPlayToMatriz(coluna, linha);
//            tabela.drawMatriz();
//        }
//    }
//}