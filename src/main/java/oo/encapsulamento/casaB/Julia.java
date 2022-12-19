package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos(){

        Ana sogra = new Ana();
        //System.out.println(sogra.segredo); //é somente dela
        //System.out.println(sogra.facoEmCasa); //não consigo, pacotes diferentes
        //System.out.println(sogra.formaDeFalar); //não consigo pois não herda nada da outra classe
        System.out.println(sogra.todosSabem); //consigo pois é público
    }


}
