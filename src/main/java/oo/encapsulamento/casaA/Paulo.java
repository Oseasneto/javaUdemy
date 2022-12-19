package oo.encapsulamento.casaA;

public class Paulo {
    //o que Paulo pode acessar da Ana?
    Ana esposa = new Ana();

    void testeAcessos(){

        //System.out.println(esposa.segredo); //não consegue acessar, é apenas de Ana
        System.out.println(esposa.facoEmCasa); //consigo, mesmo pacote
        System.out.println(esposa.formaDeFalar); //consigo
        System.out.println(esposa.todosSabem); //consigo
    }
}
