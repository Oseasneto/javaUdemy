package oo.encapsulamento.casaB;

//Ana está em outro pacote, logo precisa ser importado
import oo.encapsulamento.casaA.Ana;

//pedro herda de Ana
public class Pedro extends Ana {

    void testeAcessos(){

        //não precisa instanciar a mãe, pois ele já herdou suas caracteristicas

        //System.out.println(segredo); //é somente dela
        //System.out.println(facoEmCasa); //não consigo, pacotes diferentes
        System.out.println(formaDeFalar); //consigo pois herdou
        System.out.println(todosSabem);
    }
}
