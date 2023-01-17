package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
    static void geraErro1(){
        //criando um erro genérico
        //para lançar o erro precisa colocar o throw
        //RuntimeException vc escolhe se quer tratar o erro / não checada
        throw new RuntimeException("Ocorreu um erro 01");
    }
    static void geraErro2() throws Exception{
        //essa exceçao é checada, não dá para copilada
        //o java obriga colocar um throw Exception na assinatura do método
        throw new Exception("Ocorreu um erro 02");
    }
}
