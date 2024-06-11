//package wellz.test;
//
//import wellz.dominio.Jogador;
//import wellz.dominio.Tabela;
//
//public class MainTest01 {
//    public static void main(String[] args) {
//        Tabela tabela = new Tabela();
//        Jogador jogador = new Jogador();
//
//        tabela.setUpMatriz(jogador);
//        tabela.drawMatriz();
//
//        double insTabela = jogador.play();
//        int coluna = (int)(insTabela%10) - 1;
//        int linha = (int)(Math.floor(insTabela/10)) - 1;
//
//        tabela.addPlayToMatriz(coluna, linha);
//        tabela.drawMatriz();
//    }
//}
