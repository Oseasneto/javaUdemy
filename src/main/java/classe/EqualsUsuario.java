package classe;

public class EqualsUsuario {
    String nome, email;

    //implementando o método equals para comparar objetos
    public boolean equals(Object objeto) {

        if (objeto instanceof EqualsUsuario) {
            //peguei o objeto e converti para usuário
            EqualsUsuario outro = (EqualsUsuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

    // o hashcode será abordado em outra aula
    public int hashCode(){
        return 0;
    }
}
