package classe;

public class Data {
    int dia, ano, mes;
    Data (){
        //dia = 01;
        //mes = 01;
        //ano = 1975;
        //this somente dentro dos construtores
        this(1, 1, 1970);
    }
    Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){

        return dia +"/" + mes + "/" + ano;
    }


}
