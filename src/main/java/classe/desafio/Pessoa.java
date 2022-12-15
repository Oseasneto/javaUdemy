package classe.desafio;

import classe.desafio.Comida;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa){

        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }
    void comer (Comida comida){
        if (comida != null){
            this.pesoPessoa += comida.pesoComida;
        }
    }

    String apresentar (){
        return "Olá meu chamo " + nomePessoa + " e " +
                "tenho " + pesoPessoa + "Kgs";
    }
}
