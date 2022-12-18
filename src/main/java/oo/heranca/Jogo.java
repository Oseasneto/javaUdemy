package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

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
