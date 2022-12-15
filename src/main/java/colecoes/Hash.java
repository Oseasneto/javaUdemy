package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        //utilizando a classe listaUsuario para o exemplo
        //hashcode é usado para filtrar pesquisa
        HashSet<ListaUsuario> usuarios = new HashSet<>();

        usuarios.add(new ListaUsuario("Pedro"));
        usuarios.add(new ListaUsuario("Ana"));
        usuarios.add(new ListaUsuario("Guilherme"));

        System.out.println(usuarios.contains(new ListaUsuario("Guilherme")));

    }
}
