package classe;

public class DesafioPrimeiroTrauma {

    int a =3;
    static int b = 4;

    public static void main(String[] args) {

        //criei uma instância (objeto) com o nome da classe
        // chamei o método
        //com o objeto posso chamar os atributos dele
        // a é um atributo da classe

        DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
        System.out.println(p.a);

        //posso também dizer que o método é static
        //como o atributo é estático posso chamar sem instaciar
        System.out.println(b);
    }
}
