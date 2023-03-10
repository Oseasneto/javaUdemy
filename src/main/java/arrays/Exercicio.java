package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunosA = new double[3];

        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunosA));
        System.out.println(notasAlunosA[0]);

        double totalAlunoA = 0;
        for (int i =0; i<notasAlunosA.length; i++){
            totalAlunoA += notasAlunosA[i];
        }
        System.out.println(totalAlunoA/notasAlunosA.length);

        //outra maneira de iniciar um array
        double[] notasAlunoB = {6.9, 8.9, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
              totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB/notasAlunoB.length);
    }
}
