package fundamentos;

public class temperatura {
    public static void main(String[] args) {
        final double ajuste = 32;
        //quando utilizar fração colocar numero decimal

        final double fator = 5/9.0;
        double fahrenheit = 86;
        double ceusus;

        ceusus = (fahrenheit - ajuste)*fator;

        System.out.println("O resultado é " + ceusus +
                "°C");

    }
}
