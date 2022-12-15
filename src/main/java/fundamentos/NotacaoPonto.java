package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora"); //substituir valor
        s = s.toUpperCase(); //deixar letras maiusculas
        s = s.concat("!!!"); //concatenando um valor
        System.out.println(s);

        //podemos fazer a modificação direta
        String x = "Neto".toUpperCase();
        System.out.println(x);

        //tipos primitivos não tem o operador "."
        int a = 3;



    }
}
