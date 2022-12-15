package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas você quer informar: ");
        int qnotas = entrada.nextInt();
        double[] notas = new double[qnotas];


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a "+ (i+1) +"ª nota: ");
            double notasrecebidas = entrada.nextDouble();
            notas[i] = notasrecebidas;
            //soma = soma + notasrecebidas;
        }

        double soma = 0;
        for (double snota: notas) {
            soma  = soma + snota;
        }

        System.out.println(soma/notas.length);
        entrada.close();
    }
}
