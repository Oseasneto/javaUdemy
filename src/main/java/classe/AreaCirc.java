package classe;

public class AreaCirc {

    double raio;
    //com o static o valor de PI é comum a todos os objetos
    static final double pi = 3.1415;
    AreaCirc (double raioInicial){
        raio = raioInicial;
    }
    double area (){
        return pi*Math.pow(raio,2);
    }
}
