package oo.heranca.desafio;

public class Carro {

    int velocidade = 0;

    int acelerar (Carro c1){
        if ( velocidade >= 0 && velocidade < 130){
            velocidade += 5;
        }
        return velocidade;
    }

    int frear (Carro c1){
        if (velocidade>0 && velocidade <= 130){
            velocidade -= 5;
        }
        return velocidade;
    }

}
