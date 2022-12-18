package oo.heranca.desafio;

public class Principal {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);

        System.out.println("A ferrari está com "+ferrari.velocidade+"km/h");

        Civic civic = new Civic();
        civic.frear(civic);

        System.out.println("O civic está com "+civic.velocidade+"km/h");

    }
}
