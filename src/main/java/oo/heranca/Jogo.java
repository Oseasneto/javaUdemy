package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        //agora o heroi precisa receber seus parâmetros de coordenadas
        Heroi heroi = new Heroi(10, 11);

        System.out.println("O monstro tem "+monstro.vida+" de vida.");
        System.out.println("O heroi tem "+heroi.vida+" de vida");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("O monstro tem "+monstro.vida+" de vida.");
        System.out.println("O heroi tem "+heroi.vida+" de vida");

    }
}
