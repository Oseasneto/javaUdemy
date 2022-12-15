package classe;

public class Equals {
    public static void main(String[] args) {

        //comparando igualdade de objetos

        EqualsUsuario u1 = new EqualsUsuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        EqualsUsuario u2 = new EqualsUsuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1.equals(u2));

        //saber se meu u2 é igual a outras coisas data
        System.out.println(u2.equals(new Data()));
    }
}
