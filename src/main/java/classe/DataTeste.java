package classe;

public class DataTeste {
    public static void main(String[] args) {

        //Data() construtor padrão
        //Data classe
        //construtores são métodos especiais
        //construtor não tem retorno

        Data d1 = new Data(23,10, 1994 );

        Data d2 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        //System.out.printf("%d/%s/%d", d2.dia, d2.mes, d2.ano);
    }
}
