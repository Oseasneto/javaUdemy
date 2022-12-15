package colecoes;

import java.util.Objects;
public class ListaUsuario {

    String nome;

    ListaUsuario(String nome){
        this.nome = nome;
    }

    //tive que implementar esse método para que aparecesse o nome do usuário
    public String toString() {
        return "Meu nome é " + this.nome;
    }

    // foi adicionado o equals e hashcode para fazer operações com objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaUsuario that = (ListaUsuario) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
