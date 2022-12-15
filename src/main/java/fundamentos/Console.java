package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); //digitar a informação

        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        //é importante fechar o Scanner
        entrada.close();
    }
}
