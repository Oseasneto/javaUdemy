package controle;

import java.util.Scanner;

public class WhileIdeterminado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = "";
        //enquanto a variável não for sair
        while (!valor.equalsIgnoreCase("Sair")){
            System.out.println("Você diz: ");
            valor = sc.nextLine();
        }

        sc.close();
    }
}
