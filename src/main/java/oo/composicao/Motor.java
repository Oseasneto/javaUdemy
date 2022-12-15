package oo.composicao;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if (ligado = true){
            //Math.round pega um valor decimal e aredonda para o inteiro mais próximo
            return (int) Math.round(fatorInjecao*3000);

        } else {
            return 0;
        }
    }

}
