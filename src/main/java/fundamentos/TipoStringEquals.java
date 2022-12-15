package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        // importante comparar String com o Equals

        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2"=="s");
        // 2 é igual ao conteúdo de s?
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.next();
        // trim tira os espaços em branco
        System.out.println("2" == s2.trim());
        // para dar verdadeiro tenho que comparar com o conteudo da String
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
