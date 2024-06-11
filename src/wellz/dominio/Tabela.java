package wellz.dominio;

public class Tabela {
    public String nullPointer = "_";
    public String[][] matriz = new String[3][3];
    public boolean someoneWin = false;

    public void setUpMatriz() {
        //Inicia a tabela
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == null) {
                    matriz[i][j] = nullPointer;
                }
            }
        }
    }

    public void drawMatriz() {
        //Desenha a tabela no console
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

                if(j == matriz[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }

    public boolean addPlayToMatriz(int coluna, int linha, Jogador jogador) {
        boolean validInput = false;
        while(!validInput) {
            try {
                //Verifica se a casa está vazia
                if(!matriz[coluna][linha].equals(nullPointer) && !jogador.name.equals("FODÃO")) {
                    drawMatriz();
                    System.out.println("\nJogada inválida, jogue novamente");
                    return false;
                } else {
                    //Adiciona os inputs da coluna e da linha na matriz
                    matriz[coluna][linha] = jogador.symbol;
                    return true;
                    ////////////////////////
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                //Verifica se o input é válido
                System.out.println("Jogada inválida, coluna ou linha inválidas");
                drawMatriz();
                return false;
            }
        }
        return false;
    }

    public void checkWin(Jogador jogador) {
        //verifica se deu velha
        if (!matriz[0][0].equals(nullPointer) && !matriz[0][1].equals(nullPointer) && !matriz[0][2].equals(nullPointer) && !matriz[1][0].equals(nullPointer) && !matriz[1][1].equals(nullPointer) && !matriz[1][2].equals(nullPointer) && !matriz[2][0].equals(nullPointer) && !matriz[2][1].equals(nullPointer) && !matriz[2][2].equals(nullPointer)) {
            System.out.println("Ces são muito ruim em, deu velha");
            someoneWin = true;
        }
        ///////////////////////

        //verticais
        if (matriz[0][0].equals(jogador.symbol) && matriz[1][1].equals(jogador.symbol) && matriz[2][2].equals(jogador.symbol)) {
            System.out.println(jogador.name + " ganhou");
            someoneWin = true;
        }
        /////
        if (matriz[0][2].equals(jogador.symbol) && matriz[1][1].equals(jogador.symbol) && matriz[2][0].equals(jogador.symbol)) {
            System.out.println(jogador.name + " ganhou");
            someoneWin = true;
        }
        ///////////////////////

        for (int i = 0; i < matriz.length; i++) {
            //Verifica horizontalmente
            if (matriz[i][0].equals(jogador.symbol) && matriz[i][1].equals(jogador.symbol) && matriz[i][2].equals(jogador.symbol)) {
                System.out.println(jogador.name + " ganhou");
                someoneWin = true;
                break;
            }
            ///////////////////////
            for (int j = 0; j < matriz[i].length; j++) {
                //verifica verticalmente
                if (matriz[0][j].equals(jogador.symbol) && matriz[1][j].equals(jogador.symbol) && matriz[2][j].equals(jogador.symbol)) {
                    System.out.println(jogador.name + " ganhou");
                    someoneWin = true;
                    break;
                }
                ///////////////////////
            }
            break;
        }
    }
}
