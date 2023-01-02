package lambdas;

//quando escreve @FunctionInterface ele força a interface ter apenas um método
@FunctionalInterface
public interface Calculo {

    //quando criamos uma interface, é esperado uma classe que implemente essa interface
    //quando criamos o método ele por padrão é público

    double executar(double a, double b);

}
