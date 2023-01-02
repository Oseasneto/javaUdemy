package lambdas;

public class CalculoTesteComLambda {
    public static void main(String[] args) {

        //nesse caso não precisamos criar varias classes com os métodos


        //aqui foi definido a soma com a função lambdas
        Calculo calc = (x, y) -> {
            return x + y;
        };
        System.out.println(calc.executar(2, 3));

        //aqui foi definido a multiplicação com outra maneira de escrever o lambda
        calc = (x, y) -> x*y;
        System.out.println(calc.executar(2,3));

    }
}
