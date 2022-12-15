package fundamentos.operadores;

public class atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a+b;
        c = c+b;
        c++; // c = c+1

        System.out.println(c);

    }
}
