package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1, num2, op;

        System.out.println("Digite o primeiro valor: ");
        num1 = sc.next();
        System.out.println("Digite a operação: (*) multiplicação," +
                "(/) divisão, (+) soma, (-) subtração");
        op = sc.next();
        System.out.println("Digite o segundo valor: ");
        num2 = sc.next();

        double primeiroValor = Double.parseDouble(num1);
        double segundoValor = Double.parseDouble(num2);

        //usando a lógica
        // se a variaval for igual a tal valor, execute 1, senão execute 2
        double result = "+".equals(op) ? primeiroValor + segundoValor : 0;
        result = "-".equals(op) ? primeiroValor - segundoValor: result;
        result = "*".equals(op) ? primeiroValor * segundoValor: result;
        result = "/".equals(op) ? primeiroValor / segundoValor: result;

        System.out.println(result);

        sc.close();


    }
}
