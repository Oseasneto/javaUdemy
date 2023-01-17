package excecao;

public class Basico {

    public static void main(String[] args) {

        //criei um aluno com valor null, logo vai dar um erro
        Aluno a1 = null;
        //para tratar o erro utilizamos o try, catch
        //dentro do try, um código que pode dar problema
        try{
            imprimirNomeAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao imprimir nome");
        }
        //aqui estamos tratando o erro de forma genérica
        //o ideal é tratar o erro de forma mais específica.



        //fazer a divisão por 0 dá um erro aritmético
        //como sabemos o erro específico, será tratado como erro aritmético
        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());;
        }

        //os dois erros foram tratados e o programa continuou rodando.

    }

    public static void imprimirNomeAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
