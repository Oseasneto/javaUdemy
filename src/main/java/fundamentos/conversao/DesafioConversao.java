package fundamentos.conversao;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        System.out.println("Digite o primeiro salário: ");
        s1 = sc.nextLine().replace(",", ".");

        System.out.println("Digite o segundo salário: ");
        s2 = sc.nextLine().replace(",",".");

        System.out.println("Digite o terceiro salário: ");
        s3 = sc.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(s1);
        double salario2 = Double.parseDouble(s2);
        double salario3 = Double.parseDouble(s3);

        double media = (salario1+salario2+salario3)/3;

        System.out.println("A média dos últimos 3 " +
                "salários é " + media);

        sc.close();

    }
}
