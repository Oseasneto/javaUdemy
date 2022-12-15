package fundamentos;

public class AreaCircuferencia {

    public static void main(String[] args) {

        double raio = 3.4;
        /*para que uma variável não mude seu valor
        colocamos o "final" antes do tipo da variável
        ou seja, tornou-se uma constante.
         */
        final double PI = 3.14159;
        //por conversão colocar constantes com letra maiuscula.


        double area = PI * raio * raio;
        System.out.println(area);

    }

}
