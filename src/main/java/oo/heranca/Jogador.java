package oo.heranca;

public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao){
        if (direcao == Direcao.NORTE){
            y--;
        } else if (direcao == Direcao.LESTE) {
            x++;
        } else if (direcao == Direcao.OESTE) {
            x--;
        } else if (direcao == Direcao.SUL){
            y++;
        }
        return true;
    }
}
