package oo.heranca;

public class Heroi extends Jogador{

    //aqui a gente reutiliza o método definido em jogador
    boolean atacar(Jogador oponente){
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
        //se o ataque for bem sucedido vai retornar verdadeiro
    }



    // aqui a gente reescreve o código como a gente quer

    /*boolean atacar(Jogador oponente){
        //Math.abs (só interessa valores positivos)
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY ==1){
            oponente.vida -= 20;
            return true;
        } else if (deltaX ==1 && deltaY ==0) {
            oponente.vida -=20;
            return true;
        } else {
            return false;
        }

    }*/

}
