package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    //chamar o método para calcular desconto
    //já tem os parâmetros na classe

    // explicitando construtor
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }
    Produto(){

    }
    double precoComDesconto(){
        return preco * (1-desconto);
    }
}
