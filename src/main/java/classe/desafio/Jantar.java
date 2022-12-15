package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Feijão",0.3);

        Comida c2 = new Comida("Arroz", 0.223);

        Comida c3 = new Comida("Hamburguer", 0.525);

        Pessoa p1 = new Pessoa("Oseas", 65.8);

        System.out.println(p1.apresentar());
        p1.comer(c3);
        System.out.println(p1.apresentar());

    }

}
