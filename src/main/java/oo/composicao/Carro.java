package oo.composicao;

public class Carro {

    //objeto motor pertence ao carro e instacio esse objeto
    Motor motor = new Motor();

    //*metodo que diz que cada vez que eu acelerar, aumenta 0.4 em
    // fatorInjeção do motor. *//
    void acelerar() {
        if (motor.fatorInjecao < 2.6){
        motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if (motor.fatorInjecao > 0.5){
        motor.fatorInjecao -= 0.4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void  desligar(){
        motor.ligado = false;
    }
    boolean estaLigado() {
        return motor.ligado;
    }

}
