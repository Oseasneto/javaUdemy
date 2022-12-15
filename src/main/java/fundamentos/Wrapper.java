package fundamentos;

//primitivos usados como objetos

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        // byte
        Byte b = 100;
        Short s = 1000;
        Long l = 1000000L;

        //pegar o valor da String e transformar em um inteiro
        //Integer i = Integer.parseInt("1000"); //int
        //System.out.println(i);

        //lendo um valor e transformando em inteiro
        Scanner entrada = new Scanner(System.in);
        Integer i = Integer.parseInt(entrada.next());
        System.out.println(i);
        entrada.close();

        Float f = 123.0F;
        System.out.println(f);
        Double d = 1234.5678;
        System.out.println(d);

        //passando de Boolean para String
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; //char
        System.out.println(c + "...");

    }
}
