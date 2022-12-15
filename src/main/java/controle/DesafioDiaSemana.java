package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String dia;
        System.out.println("Digite o dia da semana: ");
        //como apenas uma palavra usar next, usar nextline para mais palavras
        dia = entrada.next();

        System.out.print("o dia " + dia + " é o ");
        if (dia.equalsIgnoreCase("segunda")){
            System.out.print("2");
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.print("3");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.print("4");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.print("5");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.print("6");
        } else if (dia.equalsIgnoreCase("sábado")) {
            System.out.print("7");
        } else if (dia.equalsIgnoreCase("domingo")) {
            System.out.print("1");
        } else {
            System.out.print("dia inválido");
        }

        System.out.print(" dia da semana!");

        entrada.close();
    }
}
