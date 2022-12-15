package fundamentos.conversao;

public class ConversaoNumeroString {

    public static void main(String[] args) {

        Integer num1 = 10000;
        //tranformar o valor em String e usar metodos da String
        System.out.println(num1.toString().length());

        int num2 = 100000;
        //transformando a variável primitiva em uma String
        System.out.println(Integer.toString(num2).length());

        System.out.println();
    }
}
