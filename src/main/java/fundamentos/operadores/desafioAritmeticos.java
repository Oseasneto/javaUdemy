package fundamentos.operadores;

public class desafioAritmeticos {
    public static void main(String[] args) {

        int a = 3;

        //elevar a potencia Math.pow
        //ela retorna um valor double
        int b = (int) Math.pow(a, 3);

        System.out.println(b);

        //resolvendo o desafio

        int c = (6*(3+2));
        int d = (int) Math.pow(c, 2);
        int e = d/(3*2);

        /*
        * poderia utilizar a expressão direto no pow
        * ex: int c = (int) Math.pow(6*(3+2), 2);
        * */

        int f = ((1-5)*(2-7))/2;
        int g = (int) Math.pow(f, 2);

        int h = e - g;
        int i = (int) Math.pow(h, 3);

        int j = (int) Math.pow(10, 3);
        int k = i/j;

        System.out.println(k);

    }
}
