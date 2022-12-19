package oo.heranca;

public class Jogador {
    
    int vida = 100;
    int x;
    int y;

    //criando um construtor para a classe que recebe parâmetros
    Jogador(int x, int y){
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente){
        //Math.abs (só interessa valores positivos)
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY ==1){
            oponente.vida -= 10;
        } else if (deltaX ==1 && deltaY ==0) {
            oponente.vida -=10;
        } else {
            return false;
        }

        return true;
    }

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
