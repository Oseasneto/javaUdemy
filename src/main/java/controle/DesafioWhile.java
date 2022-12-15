package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno " +
                "ou digite -1 para sair.");

        String nota = "";

        double total = 0;
        int invalida = 0;
        double media = 0;
        while (!nota.equals("-1")) {

            System.out.print("Nota: ");
            nota = entrada.nextLine().replaceAll(",", ".");
            double notas = Double.parseDouble(nota);

            if (notas >= 0 && notas <= 10) {
                total = notas + total;
                media = media + 1;
            } else if (notas != -1){
                invalida = invalida + 1;
            }
        }
        media = total/media;
        System.out.printf("A Média do aluno é %.1f, e foram " +
                "digitadas %d notas inválidas ", media, invalida);

        entrada.close();
    }
}
