package lambdas;

public class Soma implements Calculo{

    //quando essa classe implementa a interface, ela é obrigada a pegar os métodos da interface
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
