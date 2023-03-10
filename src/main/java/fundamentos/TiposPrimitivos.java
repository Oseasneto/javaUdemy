package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //Informações do funcionário

        // tipos numericos inteiro
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3234845223L;

        //tipos numericos reais
        float salario = 11445.44F;
        double vendasAcumuladas = 2991797103.01;

        //tipo booleano
        boolean estaDeFerias = false;

        //Tipo caractere
        char status = 'A'; //ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa*365);

        //numero de viagens
        System.out.println(numeroDeVoos/2);

        //pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println(id + "ganha" + salario);
        System.out.println("Férias?" + estaDeFerias);
        System.out.println("Status" + status);

    }
}
