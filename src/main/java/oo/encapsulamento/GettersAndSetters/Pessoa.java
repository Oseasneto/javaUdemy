package oo.encapsulamento.GettersAndSetters;

public class Pessoa {

    // como idade é privado, apenas a classe pessoa pode ler ou alterar
    private int idade;
    private String nome;

    // Getters e stters criados automaticamente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // para outra classe ler ou alterar precisamos criar métodos
    //o método getter ler.
    public int getIdade(){
        return idade;
    }

    //o método setter altera.
    //não preciso retornar nada
    public void setIdade(int novaIdade) {
        //se for colocado um valor negativo, considero o valor absoluto
        idade = Math.abs(novaIdade);
        //não devo considerar valores maiores do que 120 anos
        if (novaIdade >=0 && novaIdade <= 120) {
        this.idade = novaIdade;
        }
    }
}
