package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        //chamando uma classe pelo construtor
        Produto p1 = new Produto("Notebook", 4356.89);

        //mesmo usando var a variável vai ser do tipo produto
        // outra maneira de chamar a classe

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;


        //foi criado duas estancias da classe produto

        System.out.println(p2.nome);
        System.out.println(p1.nome);

        //métodos tem parenteses, atributos não
        double precofinal1 = p1.precoComDesconto();
        double precofinal2 = p2.precoComDesconto();
        System.out.printf("%.2f ", precofinal1);
        System.out.println();
        System.out.println(precofinal2);

    }
}
