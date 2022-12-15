package fundamentos;

import java.util.Locale;

public class TipoString {
    public static void main(String[] args) {
        //qual a letra no indice 0
        System.out.println("Olá pessoal".charAt(0));

        String s = "Boa tarde";
        s = s.toLowerCase();
        System.out.println(s.concat("!!!"));

        //a String começa com "boa"
        System.out.println(s.startsWith("boa"));

        //comprimento da String
        System.out.println(s.length());

        //a String termina com
        System.out.println(s.endsWith("!"));

        // a String contem qual?
        System.out.println("Frase qualquer".contains("qual"));

        //qual o indice da palavra
        System.out.println("frase qualquer".indexOf("qual"));

        //comparação de igualdade
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("bom dia"));

        //comece a String a partir de um valor dado, no exemplo começa do indice 6
        System.out.println("Frase qualquer".substring(6));
        //também podemos definir substring até onde queremos, no exemplo começa no 6 e vai até o 9.
        System.out.println("frase qualquer".substring(6, 10));

        //maneira de concatenar sem utilizar muitos "+"
            var nome = "Pedro";
            var sobrenome = "Santos";
            var idade = 33;
            var salario = 12345.982;

            //posso usar \n para dizer que quero a frase ou palavra na proxima linha
            // %s substitue String, %d substitue inteiro
            // %d substitue double, ".2" casas depois da virgula que quero mostrar

            System.out.printf("O senhor %s %s tem %d anos e " +
                    "ganha R$%.2f", nome, sobrenome, idade, salario);

            /* No lugar de "printf" também posso utilizar o String.format
            exemplo:
            String frase = String.format("O senhor %s %s tem %d anos e " +
                    "ganha R$%.2f", nome, sobrenome, idade, salario);
            System.out.println(frase);

            */

    }
}
