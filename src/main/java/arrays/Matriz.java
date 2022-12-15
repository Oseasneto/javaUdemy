package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int qAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qAlunos][qNotas];



        // o professor escreveu o for assim

       /* for (int i = 0; i <notasDaTurma.length ; i++) {
            for (int j = 0; j <notasDaTurma[i].length ; j++) {

                System.out.printf("Informe a nota %d do" +
                        " aluno %d: ", j, i);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        } */

        double total = 0;
        for (int i = 1; i <= qAlunos ; i++) {
            for (int j = 1; j <= qNotas ; j++) {

                System.out.println("Informe a " + j + "ª nota do aluno " +i);
                notasDaTurma[i-1][j-1] = entrada.nextDouble();
                //somando as notas da matriz
                total += notasDaTurma [i-1][j-1];

            }
        }



        //exibindo a matriz
        System.out.println(Arrays.deepToString(notasDaTurma));

        //calculando média
        System.out.println(total/(qAlunos*qNotas));


        entrada.close();
    }
}
