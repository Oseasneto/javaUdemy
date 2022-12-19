package oo.encapsulamento.GettersAndSetters;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setIdade(30); //alterou a idade
        p1.setNome("João");

        System.out.println(p1.getIdade()); //leu a idade
        System.out.println(p1.getNome()); //lendo o nome
    }
}
