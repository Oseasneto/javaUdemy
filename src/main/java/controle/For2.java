package controle;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {

        for (int contador = 10; contador >= 0; contador = contador - 2){
            System.out.println(contador);
        }
        int contador = 0;
        for (int i = 0; i <= 6; i++) {
            Scanner sc = new Scanner(System.in);

            double valorRecebido;
            valorRecebido = sc.nextDouble();

            if(valorRecebido >0.0){
                contador = contador+1;
            }

        }

        System.out.println(contador + " valores positivos");
    }
    }

